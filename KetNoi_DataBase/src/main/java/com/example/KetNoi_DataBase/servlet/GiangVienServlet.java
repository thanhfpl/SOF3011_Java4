package com.example.KetNoi_DataBase.servlet;

import com.example.KetNoi_DataBase.enity.Category;
import com.example.KetNoi_DataBase.repository.CategoryRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@WebServlet(name = "GiangVienServlet", value = {
        "/giang-vien/hien-thi-tat-ca", //GET
        "/giang-vien/detail",   //GET
        "/giang-vien/remove",   //GET
        "/giang-vien/view-update", //GET
        "/giang-vien/update", //POST
        "/giang-vien/tim-kiem", //GET
        "/giang-vien/add" //POST

})
public class GiangVienServlet extends HttpServlet {
    private List<Category> lists = new ArrayList<>();
    private CategoryRepository categoryRepository = new CategoryRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("hien-thi-tat-ca")){
            this.hienThiTatCa(request,response);
        }else if (uri.contains("detail")){
            this.detail(request,response);
        }else if (uri.contains("remove")){
            this.remove(request,response);
        }else if (uri.contains("view-update")){
            this.viewUpdate(request,response);
        }else {
            this.timKiem(request,response);
        }

    }

    private void timKiem(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewUpdate(HttpServletRequest request, HttpServletResponse response) {
    }

    private void remove(HttpServletRequest request, HttpServletResponse response) {
    }

    private void detail(HttpServletRequest request, HttpServletResponse response) {
    }

    private void hienThiTatCa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        lists = categoryRepository.getAll();
        request.setAttribute("lists",lists);
        request.getRequestDispatcher("/main/MainGV.jsp").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("update")){
            this.update(request,response);
        }else {
            this.add(request,response);
        }

    }

    private void add(HttpServletRequest request, HttpServletResponse response) {
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
    }
}
