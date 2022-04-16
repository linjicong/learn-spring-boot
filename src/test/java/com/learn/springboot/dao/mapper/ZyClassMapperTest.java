package com.learn.springboot.dao.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ZyClassMapperTest {

    @Autowired
    private ZyClassMapper zyClassMapper;

    @Test
    void selectByPrimaryKey() {
        System.out.println(zyClassMapper.selectByPrimaryKey(1));
    }
}