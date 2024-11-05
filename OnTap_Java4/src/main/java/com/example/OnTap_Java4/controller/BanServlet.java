package com.example.OnTap_Java4.controller;

import com.example.OnTap_Java4.entity.Ban;
import com.example.OnTap_Java4.repository.BanRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "BanServlet", value = {
        "/ban/hien-thi",
        "/ban/add",
        "/ban/detail",
        "/ban/xoa"
})
public class BanServlet extends HttpServlet {
    private BanRepository banRepository = new BanRepository();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("hien-thi")){
            this.hienThi(request,response);
        }else  if (uri.contains("detail")){
            this.detail(request,response);
        }else {
            this.xoa(request,response);
        }

    }

    private void xoa(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("idXoa");
        Ban ban = banRepository.getOne(Long.valueOf(id));
        banRepository.xoaBan(ban);
        response.sendRedirect("/ban/hien-thi");

    }

    private void detail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("idDetail");
        Ban ban = banRepository.getOne(Long.parseLong("id"));
        request.setAttribute("ban123",ban);
        request.getRequestDispatcher("/view/ban-detail.jsp").forward(request,response);
    }

    private void hienThi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Ban> listBan = banRepository.getALl();
        request.setAttribute("a", listBan);
        request.getRequestDispatcher("/view/Main.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("add"));

    }
}
