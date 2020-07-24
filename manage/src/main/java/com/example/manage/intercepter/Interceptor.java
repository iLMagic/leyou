package com.example.manage.intercepter;

import com.example.manage.vo.ResultVo;
import com.google.inject.internal.cglib.core.$Constants;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class Interceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("api before");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("post handle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        System.out.println(ex);
//        if (ex != null) {
////            ServletOutputStream outputStream = response.getOutputStream();
//            ResultVo<Exception> exceptionResultVo = ResultVo.serverUnknown(ex);
//            System.out.println(exceptionResultVo.toString());
//            response.getWriter().write(exceptionResultVo.toString());
//        }
//        System.out.println("api after");
    }
}
