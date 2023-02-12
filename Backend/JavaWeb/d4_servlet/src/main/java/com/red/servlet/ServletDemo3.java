package com.red.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/demo3")
public class ServletDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. **请求行**：GET/reuqest-demo/req1?username=zhangsan HTTP/1.1
        //   - String getMethod()：获取请求方式：GET
        String method = req.getMethod();
        System.out.println("请求方式：" + method);
        //   - String getContextPath()：获取虚拟目录（项目访问路径）：
        String contextPath = req.getContextPath();
        System.out.println("虚拟目录" + contextPath);
        //   - StringBuffer getRequestURL() ：获取URL(统一资源定位符)：http://localhost/demo3
        StringBuffer url = req.getRequestURL();
        System.out.println(url.toString());

        //   - String getRequestURI()：获取URI(统一资源标识符)：/demo3
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);
        //   - String getQueryString()：获取请求参数（GET方式）：username=zhangsan&password=123
        String queryString = req.getQueryString();
        System.out.println(queryString);
        //2. **请求头**：
        //   - String getHeader(String name)：根据请求头名称，获取值。（user-agent：浏览器版本）
        String agent = req.getHeader("user-agent");
        System.out.println(agent);
        //3. **请求体**：
        //   - ServletInputStream getInputStream()：获取字节输入流（音视频文件）
        //   - BufferReader getReader()：获取字符输入流（文本）
        BufferedReader reader = req.getReader();
        String line = reader.readLine();
        System.out.println(line);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
