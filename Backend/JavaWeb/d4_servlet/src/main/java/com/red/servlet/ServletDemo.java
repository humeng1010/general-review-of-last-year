package com.red.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet("/demo")
public class ServletDemo implements Servlet {

    /**
     * 提供服务方法，每次Servlet被访问，都会调用该方法
     * @param req 	the <code>ServletRequest</code> object that contains
     *			the client's request
     *
     * @param res 	the <code>ServletResponse</code> object that contains
     *			the servlet's response
     *
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("有人请求该资源");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("初始化方法，在Servlet对象被创建时执行，只执行一次 ");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }



    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("销毁方法，当Servlet被销毁时，调用该方法，在内存释放或服务关闭时销毁Servlet ");

    }
}
