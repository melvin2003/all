package com.melvin.spring.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.melvin.spring.service.TestjService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:springj.xml"})
public class TestjServiceImplTest {

    @Autowired
    private TestjService testjService;

    @Test
    public void test() {

    }

    //@Test
    public void test3() {
        testjService.test3();
    }

    //@Test
    public void test4() {
        testjService.test4();
    }

    //@Test
    public void test5() {
        testjService.test5();
    }

    //@Test
    public void test6() {
        testjService.test6();
    }
}
