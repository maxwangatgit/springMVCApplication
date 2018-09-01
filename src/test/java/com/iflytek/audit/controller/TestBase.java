package com.iflytek.audit.controller;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * TestBase
 *
 * @author jianwang15@iflytek.com
 * @created 2018/8/20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:conf/spring/spring-config.xml","classpath:conf/mybatis/spring-mybatis.xml"})
public class TestBase {

}
