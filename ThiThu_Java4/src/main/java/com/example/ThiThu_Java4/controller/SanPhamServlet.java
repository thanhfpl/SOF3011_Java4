package com.example.ThiThu_Java4.controller;

import com.example.ThiThu_Java4.entity.SanPham;
import com.example.ThiThu_Java4.repository.SanPhamRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "SanPhamServlet", value = {
        "/san-pham/hien-thi",
        "/san-pham/add",
        "/san-pham/detai",
        "/san-pham/update"
})
public class SanPhamServlet extends HttpServlet {
    private SanPhamRepository sanPhamRepository = new SanPhamRepository();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("hien-thi")){
            this.hienThi(request,response);
        }else {
            this.detail(request,response);
        }
    }

    private void detail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("idDetail");
        SanPham sanPham = sanPhamRepository.getOne(Long.valueOf(id));
        request.setAttribute("dt",sanPham);
        request.getRequestDispatcher("/view/san-pham-detail.jsp").forward(request,response);
    }

    private void hienThi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<SanPham> list = sanPhamRepository.getALl();
        request.setAttribute("a", list);
        request.getRequestDispatcher("/view/SanPham.jsp").forward(request,response);

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
