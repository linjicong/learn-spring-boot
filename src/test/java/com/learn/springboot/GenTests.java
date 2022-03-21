package com.learn.springboot;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.learn.springboot.domain.ConfigMetadata;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author linjicong
 * @date 2022-03-18 15:19
 */
public class GenTests {

    @Test
    void readJson() {
        FileReader fileReader = new FileReader("spring-configuration-metadata-spring-boot-autoconfigure.json");
        ConfigMetadata configMetadata=JSONUtil.toBean(fileReader.readString(), ConfigMetadata.class);
        Map<ConfigMetadata.Groups, List<ConfigMetadata.Properties>> map = new TreeMap<>(Comparator.comparing(ConfigMetadata.Groups::getName));
        List<ConfigMetadata.Groups> groups=configMetadata.getGroups();
        List<ConfigMetadata.Properties> properties=configMetadata.getProperties();
        Set<ConfigMetadata.Properties> noSourcePropertiesList = new TreeSet<>(Comparator.comparing(ConfigMetadata.Properties::getName));
        StringBuilder stringBuilder = new StringBuilder();
        // 分类汇总
        for (ConfigMetadata.Groups group : groups) {
            List<ConfigMetadata.Properties> propertiesList = new ArrayList<>();
            for (ConfigMetadata.Properties property : properties) {
                if(property.getSourceType()!=null&&property.getSourceType().equals(group.getType())&& property.getName().contains(group.getName())){
                    propertiesList.add(property);
                }else if(property.getSourceType()==null){
                    noSourcePropertiesList.add(property);
                }
            }
            //propertiesList.sort(Comparator.comparing(ConfigMetadata.Properties::getName));
            map.put(group, propertiesList);
        }


        // 已分类
        for (Map.Entry<ConfigMetadata.Groups, List<ConfigMetadata.Properties>> entry : map.entrySet()) {
            stringBuilder.append(convert(entry.getKey(), entry.getValue()));
        }
        // 未分类
        stringBuilder.append(convert(null, new ArrayList<>(noSourcePropertiesList)));
        // 写入文件
        FileWriter fileWriter = new FileWriter(System.getProperty("user.dir")+"/spring-boot-gen.md");
        fileWriter.write(stringBuilder.toString());
    }

    public String convert(ConfigMetadata.Groups groups, List<ConfigMetadata.Properties> properties) {
        StringBuilder stringBuilder = new StringBuilder();
        String separator = System.lineSeparator();
        stringBuilder.append(separator);
        if(groups!=null) {
            stringBuilder.append("### " + groups.getName() + ".xx" + separator)
                    .append("描述:" + separator)
                    .append("类型:`" + groups.getType() + "`" + separator)
                    .append("源类型:`" + groups.getSourceType() + "`" + separator);
        }else{
            stringBuilder.append("### 未分类" + separator)
                    .append("描述:" + separator);
        }
        stringBuilder.append(separator)
                .append("| 名称 | 类型 | 描述 | 默认值 | 过期替代 |"+separator)
                .append("|-----|------|-----|-------|---------|"+separator);
        for (ConfigMetadata.Properties property : properties) {
            Object defaultValue=property.getDefaultValue();
            Object deprecated=property.getDeprecated();
            ConfigMetadata.Properties.Deprecation deprecation=property.getDeprecation();
            if(groups!=null) {
                stringBuilder.append("| " + property.getName().substring(property.getName().lastIndexOf(".") + 1) + " | " + property.getType() + " | " + StrUtil.replace(property.getDescription(),"\n","") + " | ");
            }else{
                stringBuilder.append("| " + property.getName() + " | " + property.getType() + " | " + StrUtil.replace(property.getDescription(),"\n","") + " | ");
            }
            if(defaultValue!=null){
                stringBuilder.append(defaultValue);
            }
            stringBuilder.append(" | ");
            if(deprecated!=null){
                stringBuilder.append(deprecated);
            }
            if(deprecation!=null){
                if(deprecation.getLevel()!=null) {
                    stringBuilder.append("," + deprecation.getLevel());
                }
                if(deprecation.getReplacement()!=null){
                    stringBuilder.append("," + deprecation.getReplacement());
                }
                if(deprecation.getReason()!=null){
                    stringBuilder.append("," + deprecation.getReason());
                }
            }
            stringBuilder.append(" | "+separator);
        }
        return stringBuilder.toString();
    }

    @Test
    void name() {
        String a= "spring.sql.init.data-locations";
        System.out.println(a.substring(a.lastIndexOf(".")+1));
    }
}
