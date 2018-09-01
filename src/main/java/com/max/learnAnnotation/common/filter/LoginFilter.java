package com.max.learnAnnotation.common.filter;


import com.max.learnAnnotation.common.SystemCode;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Desc: audit
 * User: tinghong@iflytek.com
 * DateTime: 2018/8/21 22:20
 */
public class LoginFilter extends OncePerRequestFilter {

//
//
//
//
//    /**
//     * 系统非登录控制url
//     */
//    @Value("#{propertiesReader['sys.not.filter']}")
//    private String notFilters = "login.do";
//
//    /**
//     * 系统管理员访问url
//     */
//    @Value("#{propertiesReader['sys.admin.filter']}")
//    private String adminFilters = "deleteUser.do,deleteProduct.do,checkUserList.do,addProduct.do";
//
//    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain
            filterChain) throws ServletException, IOException {}
//
//
//
//        // 不过滤url
//        String[] notFilter = notFilters.split(",");
//        // 获取uri
//        String url = request.getRequestURI();
//
//        // 是否需要过滤url,false 不需要 true 需要
//        boolean doFilter = checkURL(notFilter, url);
//        if (!doFilter) {
//            TbUser user = RequestContextUtils.getCurrentUser(request);
//            if (null == user) {
//                // Session过期,是AJAX请求
//                if (null != request.getHeader("x-requested-with") && request.getHeader("x-requested-with")
//                        .equalsIgnoreCase("XMLHttpRequest")) {
//                    response.setHeader("sessionstatus", "timeout");
//                    response.sendError(518, "session timeout.");
//                    return;
//                } else {
//                    // Session过期,非AJAX请求
//                    response.sendRedirect(request.getContextPath()+"/login");
//                    return;
//                }
//            } else {
//                // 在这里过滤没有权限的url；true-有权限访问，false-没有权限访问
//                boolean doView = checkUserAuthority(url,request);
//                if (doView) {
//                    filterChain.doFilter(request, response);
//                } else {
//                    response.sendError(403, "403 forbidden.");
//                    return;
//                }
//            }
//        } else {
//            filterChain.doFilter(request, response);
//        }
//    }
//
//    /**
//     * 判断用户是否有访问权限；
//     *
//     * @param url :当前访问地址
//     * @return true-有权限访问，false-没有权限访问
//     * @history:
//     */
//    private boolean checkUserAuthority(String url,HttpServletRequest request) {
//        boolean flag = false;
//        // 判断用户是否是管理员，如果是管理员直接放行
//        TbUser user = RequestContextUtils.getCurrentUser(request);
//        // 普通用户
//        if (user.getUserType() == SystemCode.USER_NUM_NOMAL) {
//            // 管理员url
//            String[] adminFilter = adminFilters.split(",");
//            if (!checkURL(adminFilter, url)) {
//                // 具有访问权限
//                flag = true;
//            }
//        } else {
//            flag = true;
//        }
//        return flag;
//    }
//
//    /**
//     * 是否需要过滤
//     *
//     * @param filters 包含的字符串集合
//     * @param url     请求的url
//     * @return false 不需要 true 需要
//     */
//    private boolean checkURL(String[] filters, String url) {
//        for (String s : filters) {
//            // 如果在管理员权限内的页面禁止放行，否则放行
//            if (url.indexOf(s) != -1) {
//                return true;
//            }
//        }
//        return false;
//    }

}
