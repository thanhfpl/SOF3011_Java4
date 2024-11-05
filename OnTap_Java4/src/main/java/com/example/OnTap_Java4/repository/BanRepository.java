package com.example.OnTap_Java4.repository;

import com.example.OnTap_Java4.entity.Ban;
import com.example.OnTap_Java4.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class BanRepository {
    private Session s;

    public BanRepository (){
        s = HibernateUtil.getFACTORY().openSession();
    }

    public Ban getOne(Long id){
        return s.find(Ban.class,id);
    }

    public void xoaBan(Ban ban){
        try {
            s.getTransaction().begin();
            s.delete(ban);
            s.getTransaction().commit();
        }catch (Exception e ){
            s.getTransaction().rollback();
        }

    }

    public List<Ban> getALl(){
        List<Ban> list = s.createQuery("FROM Ban ").list();
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new BanRepository().getALl());
    }
}
