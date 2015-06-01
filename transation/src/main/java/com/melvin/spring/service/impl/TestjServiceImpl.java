package com.melvin.spring.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.melvin.spring.dao.TestjDao;
import com.melvin.spring.service.TestjService;

/**
 * 计算月结算奖金Service
 * 
 * @author XIAOCY
 */

@Service("testjService")
public class TestjServiceImpl implements TestjService {

    @Resource
    private TestjDao testjDao;

    @Resource
    TestjService testjService;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public void test1() {
        Map<String, Object> param = new java.util.HashMap<String, Object>();
        param.put("id", 1);
        param.put("name", "test1");
        testjDao.insert1(param);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public void test2() {
        Map<String, Object> param = new java.util.HashMap<String, Object>();
        param.put("id", 2);
        param.put("name", "test2");
        testjDao.insert1(param);
        int i = 1 / 0;
        param.put("id", 3);
        param.put("name", "test3");
        testjDao.insert1(param);
    }

    public void test3() {
        test1();
        test2();
    }

    public void test4() {
        Map<String, Object> param = new java.util.HashMap<String, Object>();
        param.put("id", 4);
        param.put("name", "test4");
        testjDao.insert1(param);
        testjService.test1();
        testjService.test2();
    }

    @Transactional(rollbackFor = Exception.class)
    public void test5() {
        test1();
        test2();
    }

    @Transactional(rollbackFor = Exception.class)
    public void test6() {
        Map<String, Object> param = new java.util.HashMap<String, Object>();
        param.put("id", 4);
        param.put("name", "test4");
        testjDao.insert1(param);
        testjService.test1();
        testjService.test2();
    }
}
