package com.java0123.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("message","this time really no chinese jenkeins can run  加中文?加中文测试是否会受本机加密软件的影响.....3");
        req.getRequestDispatcher("/WEB-INF/jsp/welcome.jsp").forward(req,resp);
    }
}
