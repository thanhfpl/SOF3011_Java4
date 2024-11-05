package com.example.OnTap_De3.servlet;

import com.example.OnTap_De3.entiy.Sach;
import com.example.OnTap_De3.repository.SachRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "SachServlet", value = {
        "/sach/hien-thi",
        "/sach/add",
        "/sach/remove",
        "/sach/detail",
        "/sach/update"
})
public class SachServlet extends HttpServlet {

    private SachRepository sachRepository = new SachRepository();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("hien-thi")) {
            this.hienThi(request, response);

        }else if (uri.contains("remove")){
            this.remove(request,response);

        }else {
            this.detail(request,response);
        }

    }

    private void remove(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("idXoa");
        Sach sach = sachRepository.getOne(Long.valueOf(id));
        sachRepository.xoaSach(sach);
        response.sendRedirect("/view/HienThi.jsp");
    }

    private void detail(HttpServletRequest request, HttpServletResponse response) {
    }

    private void hienThi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Sach> sachList = sachRepository.getALl();
        request.setAttribute("a",sachList);
        request.getRequestDispatcher("/view/HienThi.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("add")){
            this.add(request,response);
        }else {
            this.update(request,response);
        }

    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
    }

    private void add(HttpServletRequest request, HttpServletResponse response) {
    }
}
