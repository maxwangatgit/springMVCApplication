package com.max.learnAnnotation.common;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Util
 *
 * @author jianwang15@iflytek.com
 * @created 2018/8/19
 */
public class Util {





    /**
     * 标识
     */
    private static final String FLAG = "flag";
    /**
     * 结果
     */
    private static final String MSG = "msg";
    /**
     * 数据
     */
    private static final String DATA = "data";
    /**
     * 数据总数
     */
    private static final String TOTAL = "total";
    /**
     * 数据总条
     */
    private static final String ROWS = "rows";
    /**
     * boolean类型true
     */
    private static final boolean TRUE = true;
    /**
     * boolean类型false
     */
    private static final boolean FALSE = false;
    /**
     * 空字符串
     */
    private static final String EMPTYSTRING = "";



    /**
     * 将内容输出到浏览器
     *
     * @param content 输出内容
     */
    public static void writeContent(String content) {
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Type", "text/plain;charset=UTF-8");
        response.setHeader("icop-content-type", "exception");
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.print(content);
        writer.flush();
        writer.close();
    }



    public static String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    /**
     *
     * 功能描述:返回当前的时间
     *
     * @param:
     * @return:
     * @auther: jianwang15@iflytek.com
     * @date: 2018/8/28 10:44
     */
    public static Date getCurrentDate(){
        Date date = new Date();
        return date;
    }



    public static <T> String resultList(List<T> list, String msg) {
        if (list == null) {
            return error();
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(ROWS, list);
        // jsonObject.put(TOTAL, list.size());
        return result(TRUE, jsonObject, msg);
    }

    /**
     * 将list封装成json字符串
     *
     * @param list 传入泛型集合
     * @return String
     * @author: pyma@iflytek.com
     * @createTime: 2016年8月4日 下午2:44:52
     * @history:
     */
    public static <T> String resultList(List<T> list) {
        if (list == null) {
            return error();
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(ROWS, list);
        return result(TRUE, jsonObject);
    }

    /**
     * 将list封装成json字符串
     *
     * @param list 传入泛型集合
     * @return String
     * @author: pyma@iflytek.com
     * @createTime: 2016年8月4日 下午2:44:52
     * @history:
     */
    public static <T> String resultOfData(List<T> list) {
        if (list == null) {
            return error();
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(DATA, list);
        return result(TRUE, jsonObject);
    }


    /**
     *
     * 功能描述: 将map数据打包成json返回
     *
     * @param: map:数据map
     * @param  msg:数据信息
     * @return:
     * @auther: jianwang15@iflytek.com
     * @date: 2018/8/20 18:46
     */
    public static <T> String resultMap(Map<T,Object> map,String msg){
        return result(true,map,msg);
    }


    /**
     *
     * 功能描述: 将map数据打包成json返回
     *
     * @param: map:数据map
     * @return:
     * @auther: jianwang15@iflytek.com
     * @date: 2018/8/20 18:46
     */
    public static <T> String resultMap(Map<T,Object> map){
        return result(true,map);
    }

    /**
     * 将数组封装成json字符串
     *
     * @param msg 消息
     * @return String
     * @author: pyma@iflytek.com
     * @createTime: 2016年8月2日 下午1:38:22
     * @history:
     */
    public static String resultArray(Object[] objects, String msg) {
        if (objects == null) {
            return error();
        }
        return result(TRUE, objects, msg);
    }

    /**
     * 将数组封装成json字符串
     *
     * @param objects
     * @return String
     * @author: pyma@iflytek.com
     * @createTime: 2016年8月4日 下午2:41:58
     * @history:
     */
    public static String resultArray(Object[] objects) {
        if (objects == null) {
            return error();
        }
        return result(TRUE, objects);
    }




    /**
     * 将对象封装成json字符串
     *
     * @param objects 传入多个对象
     * @return
     * @throws IOException String
     * @author: pyma@iflytek.com
     * @createTime: 2016年8月2日 上午11:27:56
     * @history:
     */
    public static String resultObject(String msg, Object... objects) throws IOException {
        JSONObject jsonObject = new JSONObject();
        if (objects != null && objects.length > 0) {
            for (int i = 0; i < objects.length; i++) {
                jsonObject.put("object" + i, objects[i]);
            }
        }
        return result(TRUE, jsonObject, msg);
    }

    /**
     * 将对象封装成json字符串
     *
     * @param objects 传入多个对象
     * @return
     * @throws IOException String
     * @author: pyma@iflytek.com
     * @createTime: 2016年8月4日 下午2:41:18
     * @history:
     */
    public static String resultObject(Object... objects) throws IOException {
        JSONObject jsonObject = new JSONObject();
        if (objects != null && objects.length > 0) {
            for (int i = 0; i < objects.length; i++) {
                jsonObject.put("object" + i, objects[i]);
            }
        }
        return result(TRUE, jsonObject);
    }

    /**
     * 携带信息的结构体
     * @param data 结构体信息
     * @return
     */
    public static String resultObject(String  msg, Object data){
        return result(true,data,msg);
    }


    /**
     * 将结构体打包成json字符串返回
     * @param data 结构体信息
     * @return
     */
    public static String resultObject(Object data){
        return result(true,data);
    }




    /**
     *
     * 功能描述: 返回失败信息
     *
     * @param: msg 待返回的信息
     * @return:
     * @auther: jianwang15@iflytek.com
     * @date: 2018/8/20 18:30
     */
    public static String error(String msg){
        return result(false,null,msg);
    }

    /**
     *
     * 功能描述: 返回失败状态
     *
     * @param:
     * @return:
     * @auther: jianwang15@iflytek.com
     * @date: 2018/8/20 18:30
     */
    public static String error(){
        return result(false,null,EMPTYSTRING);
    }



    /**
     *
     * 功能描述: 返回成功信息
     *
     * @param: msg 待返回的信息
     * @return:
     * @auther: jianwang15@iflytek.com
     * @date: 2018/8/20 18:30
     */
    public static String success(String msg){
        return result(true,null,msg);
    }

    /**
     *
     * 功能描述: 返回成功状态
     *
     * @param:
     * @return:
     * @auther: jianwang15@iflytek.com
     * @date: 2018/8/20 18:30
     */
    public static String success(){
        return result(true,null,EMPTYSTRING);
    }



    /**
     *
     * 功能描述: 返回标志位信息和数据
     *
     * @param:  flag:标志位 data:数据 msg:消息
     * @return: 
     * @auther: jianwang15@iflytek.com
     * @date: 2018/8/20 17:33
     */
    public static String result(boolean flag,Object data,String msg){
        JSONObject res = new JSONObject();
        res.put(FLAG,flag);
        res.put(DATA,data);
        res.put(MSG,msg);
        return JSONObject.toJSONString(res);
    }

    /**
     *
     * 功能描述:
     *
     * @param: flag:返回信息的状态 data:返回的数据
     * @return:
     * @auther: jianwang15@iflytek.com
     * @date: 2018/8/20 18:23
     */
    public static String  result(boolean flag,Object data){
        JSONObject res = new JSONObject();
        res.put(FLAG,flag);
        res.put(DATA,data);
        return JSONObject.toJSONString(res,SerializerFeature.DisableCircularReferenceDetect);
    }

    /**
     *
     * 功能描述:
     *
     * @param: 对象是否为空,true 空，false 不为空
     * @return:
     * @auther: jianwang15@iflytek.com
     * @date: 2018/8/20 18:23
     */
    public static Boolean isEmpty(Object object){
      if(null != object){
          return false;
      }else return true;
    }

}
