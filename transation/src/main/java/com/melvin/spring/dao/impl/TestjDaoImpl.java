/**
 * 项目名：trans
 * 包名：cn.daohegroup.school.jdbc.dao.impl
 * 文件名：TestjDaoImpl.java
 * 版本信息：@version 1.0
 * 日期：2015年5月22日-下午4:06:14
 * Copyright 2015 joymain Tech. Co. Ltd. All Rights Reserved.  
 */
package com.melvin.spring.dao.impl;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.melvin.spring.dao.TestjDao;

/**
 * TODO 添加类的一句话简单描述.
 * 
 * @author 刘明云
 * @email soul0328@qq.com
 * @qq 278834379
 * @since 2015年5月22日 下午4:06:14
 *
 */
@Repository("testjDao")
public class TestjDaoImpl extends NamedParameterJdbcDaoSupport implements TestjDao {

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    void init() {
        setDataSource(dataSource);
    }

    @Override
    public void insert1(Map<String, Object> param) {
        this.getJdbcTemplate().execute("insert into test values('" + param.get("id") + "','" + param.get("name") + "')");
    }

}
