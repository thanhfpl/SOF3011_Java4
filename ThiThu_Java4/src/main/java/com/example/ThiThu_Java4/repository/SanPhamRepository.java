package com.example.ThiThu_Java4.repository;

import com.example.ThiThu_Java4.entity.SanPham;
import com.example.ThiThu_Java4.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class SanPhamRepository {
    private Session s;

    public SanPhamRepository(){
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<SanPham> getALl(){
        List<SanPham> listSanPham = s.createQuery("FROM SanPham").list();
        return listSanPham;
    }

    public SanPham getOne (Long id){
       return s.find(SanPham.class,id);
    }

    public static void main(String[] args) {
        System.out.println(new SanPhamRepository().getALl());
    }
}
