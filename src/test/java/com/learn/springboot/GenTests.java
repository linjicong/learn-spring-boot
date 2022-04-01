package com.learn.springboot;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.util.HexUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
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
    void test() {
        String tmpDirPath = FileUtil.getTmpDirPath();
        System.out.println(tmpDirPath);
        String property = System.getProperty("user.dir");
        System.out.println(property);
        String fileName = "spring-configuration-metadata-spring-boot-autoconfigure.json";
        System.out.println(fileName.substring(StrUtil.ordinalIndexOf(fileName,"-",3)+1,fileName.indexOf(".")));
    }
}
