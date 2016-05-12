package com.zhukova;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class Chat extends HttpServlet {

    @Override
    //метод возвращает список всех обращений
    public void doGet(HttpServletRequest request, HttpServletResponse response) {

    }

    @Override
    //отправляет строчку, обрабатывая запрос клиента
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }
}

