/*
* 文件名：SystemCode
* 版权：Copyright @ 2017 zhjt-web-jest All Rights Reserved.
* 描述：系统常量类
* 修改人：kpchen@iflytek.com
* 修改时间：2017年5月22日 下午3:03:11
* 修改内容：〈修改内容〉
*/
package com.max.learnAnnotation.common;

/**
 * {系统常量类}
 *
 * @desc: zhjt-web-jest
 * @author: kpchen@iflytek.com
 * @createTime: 2017年5月22日 下午3:03:11
 * @history:
 * @version: v1.0
 */
public interface SystemCode {


    final  static String  UNKNOWERROR = "UNKNOWNERROR";


    /**
     * RequestMapping的字符集
     */

    /****************************************************************************/
    // 通用字段
    //当前用户被删除的状态
    final static Short DELETE_TRUE = 2;
    final static Short DELETE_FALSE = 1;
    final static String UKNOWN_ERROR = "未知错误";
    /****************************************************************************/



    /****************************************************************************/
    //用户字段
    final static String COMMON_PRODUCES = "application/json;charset=UTF-8";
    final static String USER_NONE = "当前用户不存在";
    final static String USER_PASSWORD_WRONG = "密码错误";
    final static String USER_LOGIN_SUCCESS = "用户登陆成功";
    final static String USER_NO_USER = "无当前用户";
    final static String USER_NO_PROPERTY = "当前用户没有权限";
    final static Short USER_NUM_ADMIN = 0;
    final static Short USER_NUM_NOMAL = 1;
    final static String USER_UPDATE_SUCESS="用户数据更新成功";
    final static String USER_UPDATE_FAIL="用户数据更新失败";
    final static String USER_DELETE_SUCESS="用户删除成功";
    final static String USER_DELETE_FAIL="用户删除失败";
    final static String USER_NAME_OCCUPY = "用户名已经被占用";
    final static Short USER_LOGOUT_TRUE =2;
    final static Short USER_LOGOUT_FALSE =1;
    final static String USER_NOUSER = "列表中暂时没有用户";
    //用户注册时默认的用户的创建id
    final static String USER_RIGESTER_CRTID = "UUUUUUUUUUU";
    /****************************************************************************/



    /****************************************************************************/
    // 登陆日志字段
    final static String LOGINLOG_CREAT_SUCCESS ="登陆日志创建成功";
    final static String LOGINLOG_CREAT_FAIL ="登陆日志创建失败";
    /****************************************************************************/


    /****************************************************************************/
    // 业务系统字段
    final static String BUSSINESSSYS_LIST_NULL ="业务系统列表为空";
    final static String BUSSINESSSYS_NOT_EXIST ="业务系统不存在";
    final static String BUSSINESSSYS_UPDATE_SUCESS="系统数据数据更新成功";
    final static String BUSSINESSSYS_UPDATE_FAIL="系统数据更新失败";
    /****************************************************************************/



    /****************************************************************************/
    // 系统模块字段
    final static String SYSMODULE_LIST_EMPTY ="系统模块列表为空";
    final static String SYSMODULE_NULL ="当前模块不存在";
    final static String SYSMODULE_UPDATE_SUCCESS ="模块信息更新成功";
    final static String SYSMODULE_UPDATE_FAIL ="模块信息更新失败";
    final static String SYSMODULE_CREAT_SUCCESS ="模块创建成功";
    final static String SYSMODULE_CREAT_FAIL ="模块创建失败";
    final static String SYSMODULE_METHOD_PUBLISH ="publish";
    final static String SYSMODULE_METHOD_DELETE ="delete";
    // 模块是否发布
    final static Short SYSMODULE_PUBLISH_TRUE =2;
    final static Short SYSMODULE_PUBLISH_FALSR =1;
    /****************************************************************************/


    /****************************************************************************/
    // 系统服务字段

    final static String SYSSERVICE_LIST_EMPTY ="系统服务列表为空";
    final static String SYSSERVICE_NULL ="内容不存在";
    final static String SYSSERVICE_UPDATE_SUCCESS ="服务信息更新成功";
    final static String SYSSERVICE_UPDATE_FAIL ="服务信息更新失败";
    final static String SYSSERVICE_CREAT_SUCCESS ="服务创建成功";
    final static String SYSSERVICE_CREAT_FAIL ="服务创建失败";
    final static String SYSSERVICE_METHOD_DELETE ="delete";
    // 模块是否发布
    final static Short SYSSERVICE_PUBLISH_TRUE =2;
    final static Short SYSSERVICE_PUBLISH_FALSR =1;
    /****************************************************************************/

    /****************************************************************************/
    //系统日志字段

    final static Short PROCESS_SUCCESS = 2;
    final static Short PROCESS_FAIL = 1;
    final static String SYSLOG_LIST_EMPTY ="服务日志列表为空";
//    final static String SYSSERVICE_NULL ="内容不存在";
//    final static String SYSSERVICE_UPDATE_SUCCESS ="服务信息更新成功";
//    final static String SYSSERVICE_UPDATE_FAIL ="服务信息更新失败";
//    final static String SYSSERVICE_CREAT_SUCCESS ="服务创建成功";
//    final static String SYSSERVICE_CREAT_FAIL ="服务创建失败";
//    final static String SYSSERVICE_METHOD_DELETE ="delete";
    /****************************************************************************/


}