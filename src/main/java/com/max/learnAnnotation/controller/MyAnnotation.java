package com.max.learnAnnotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * MyAnnotation 实现错误的同意处理
 *
 * @author jianwang15@iflytek.com
 * @created 2018/9/1
 */
@Controller
public class MyAnnotation {


    /**
     *    测试字符串数组
     */
    private String[]  testList = {"123456","123456"};


    /**
     *
     * 功能描述: 抛出异常判断异常处理函数能否捕捉
     *
     * @param: * @param null
     * @return:
     * @auther: jianwang15@iflytek.com
     * @date: 2018/9/1 18:40
     */
    @RequestMapping(value = "/test1.do" ,method = RequestMethod.GET)
    @ResponseBody
    public String  testExceptionOne(){
        for(int i = 0; i < testList.length + 1 ;i++ )
        {
            System.out.println(testList[i]);
        }
        return null;
    }

    /**
     *
     * 功能描述: 抛出异常判断异常处理函数能否捕捉
     *
     * @param: * @param null
     * @return:
     * @auther: jianwang15@iflytek.com
     * @date: 2018/9/1 18:40
     */
    @RequestMapping(value = "/test2.do" ,method = RequestMethod.GET)
    @ResponseBody
    public String  testExceptionTwo(){
        for(int i = 0; i < testList.length + 1 ;i++ )
        {
            System.out.println(testList[i]);
        }
        return null;
    }



}
