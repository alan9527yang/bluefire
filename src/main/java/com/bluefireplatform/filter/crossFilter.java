package com.bluefireplatform.filter;


import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class crossFilter implements Filter {


    private Properties pp = new Properties();

    private FilterConfig config;

    private String allowDomain = "http://allow.com";

    @Override
    public void destroy() {
        pp = null;
        this.config = null;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        // 得到请求的uri和url
        String reqUri = req.getRequestURI();
        String reqUrl = req.getRequestURL().toString();
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        // 跨域处理
        this.crossDomain(req, resp, reqUrl);
        chain.doFilter(req, resp);

    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

    /**
     * 处理跨域问题
     */
    private void crossDomain(HttpServletRequest request, HttpServletResponse response, String url) {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Origin", "*" );
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
        response.setHeader("Access-Control-Allow-Headers",
                "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,Authorization");

    }

}
