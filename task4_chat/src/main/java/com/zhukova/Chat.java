package com.zhukova;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class Chat extends HttpServlet {

    @Override
    //метод возвращает список всех обращений
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = null;

        try {
            out = response.getWriter();
            fReader(out);
        } catch (IOException ignored) {
        }
    }

    private void fReader(PrintWriter out) throws IOException {
        String path = "D:\\GALINA\\УЧЕБА\\3 КУРС\\ПРОГРАММИРОВАНИЕ WOW\\github\\java_oh\\task4_chat\\src\\main\\webapp\\WEB-INF\\index.html";
        InputStream is = new FileInputStream(new File(path));
        Reader r = new InputStreamReader(is, "utf-8");
        BufferedReader br = new BufferedReader(r);
        while (true) {
            String s = br.readLine();
            if (s == null)
                break;
            out.println(s);
        }
        is.close();
    }

    @Override
    //отправляет строчку, обрабатывая запрос клиента
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }
}

