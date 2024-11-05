package com.example.OnTap_De3.repository;

import com.example.OnTap_De3.entiy.Sach;
import com.example.OnTap_De3.util.HibernateConfig;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class SachRepository {
    private Session s;

    public SachRepository(){
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<Sach> getALl(){
        List<Sach> listSach = s.createQuery("FROM Sach").list();
        return listSach;
    }


    public Sach getOne(Long id){
        return s.find(Sach.class,id);
    }

    public void xoaSach (Sach sach){
        try {
            s.getTransaction().begin();
            s.delete(sach);
            s.getTransaction().commit();

        }catch (Exception e){
            s.getTransaction().rollback();
        }
    }

    public static void main(String[] args) {
        System.out.println(new SachRepository().getALl());
    }
}
