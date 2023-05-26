package com.illusion.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String remember = req.getParameter("remember");

        if("1".equals(remember)){
            //勾选了，发送Cookie
            //1. 创建Cookie对象
            Cookie c_username = new Cookie("username",username);
            // 设置Cookie的存活时间
            c_username.setMaxAge(300);

            resp.addCookie(c_username);

            resp.sendRedirect("/quiz3/welcome.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
