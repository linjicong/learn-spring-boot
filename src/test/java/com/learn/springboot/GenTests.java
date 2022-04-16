package com.learn.springboot;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import org.junit.jupiter.api.Test;

/**
 * @author linjicong
 * @date 2022-03-18 15:19
 */
public class GenTests {

    @Test
    void test() {
        String tmpDirPath = FileUtil.getTmpDirPath();
        System.out.println(tmpDirPath);
        String property = System.getProperty("user.dir");
        System.out.println(property);
        String fileName = "spring-configuration-metadata-spring-boot-autoconfigure.json";
        System.out.println(fileName.substring(StrUtil.ordinalIndexOf(fileName,"-",3)+1,fileName.indexOf(".")));
    }
}
