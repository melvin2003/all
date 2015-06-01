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
        try {
            testjService.test3();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    //@Test
    public void test4() {
        try {
            testjService.test4();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    //@Test
    public void test5() {
        try {
            testjService.test5();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Test
    public void test6() {
        try {
            testjService.test6();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
