package com.Interceptor.Ctrl.lanjie;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器：动态拦截方法调用的机制，在SPringMVC中动态拦截控制器方法的执行
 * 作用：
 *      1.在指定的方法调用前后执行预先设定的代码
 *      2.组织原始方法的执行
 * 参数：
 *      request：请求对象
 *      response：响应对象
 *      handler：被调用的处理器对象，本质上是一个方法对象，对反射中的Meyhod方法进行了包装
 *      modelAndview：如果处理器执行完成具有返回结构，可以读取到对应数据与页面信息，并进行调用（现有JSON数据，该参数利用率不高）
 *      ex：如果处理器执行过程中出现异常对象，可以针对异常情况进行单独处理（已有自定义异常处理器进行处理，利用率不高）
 * 拦截器运行顺序：
 *      按照拦截器添加顺序为准，A1->A2->B1->b2;  返回时：b2-B1-A2-A1
 * 拦截器和过滤器：
 *      拦截器 Filter：Servlet技术、对所有访问进行拦截
 *      过滤器 Interceptor：SpringMVC技术、拦截器只能对SpringMVC的内容进行增强
 */
@Component
public class ProjInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("原始方法调用前执行的内容");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("原始方法调用后执行");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("原始方法调用完成后执行");
    }
}

