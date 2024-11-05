package com.example.demo3.repository;

import com.example.demo3.entity.SanPham;
import com.example.demo3.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class SanPhamRepository {
    private Session s;

    private SanPhamRepository(){
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<SanPham> getAll(){
        List<SanPham> lists = s.createQuery("FROM SanPham ").list();
        return lists;
    }

    public SanPham getOne(Long id){
        return s.find(SanPham.class,id);
    }

    public void addSanPham(SanPham sp){
        try {
            s.getTransaction().begin();
            s.persist(sp);
            s.getTransaction().commit();

        }catch (Exception e){
            s.getTransaction().rollback();

        }

    }


    public static void main(String[] args) {
        System.out.println(new SanPhamRepository().getAll());
    }
}
