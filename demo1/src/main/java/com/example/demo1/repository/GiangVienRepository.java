package com.example.demo1.repository;


import com.example.demo1.entity.GiangVien1;
import com.example.demo1.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class GiangVienRepository {
    // CRUD
    private Session s;

    public GiangVienRepository() {
        // mo 1 lan phien session
        s = HibernateUtil.getFACTORY().openSession();
    }

    public List<GiangVien1> getAll() {
        List<GiangVien1> lists = s.createQuery("FROM GiangVien1 ").list();
        return lists;
    }

    public GiangVien1 getOne (Long id) {
        return s.find(GiangVien1.class,id);
    }

    public void addGiangVien(GiangVien1 gv) {
        try {
            s.getTransaction().begin();
            // add giang vien
            s.persist(gv);
            // commit du lieu
            s.getTransaction().commit();
        } catch (Exception e) {
            // rollback
            s.getTransaction().rollback();
        }
    }

    public void updateGiangVien(GiangVien1 gv) {
        try {
            s.getTransaction().begin();
            // update giang vien
            s.merge(gv);
            // commit du lieu
            s.getTransaction().commit();
        } catch (Exception e) {
            // rollback
            s.getTransaction().rollback();
        }
    }

    public void deleteGiangVien(GiangVien1 gv) {
        try {
            s.getTransaction().begin();
            // delete giang vien
            s.delete(gv);
            // commit du lieu
            s.getTransaction().commit();
        } catch (Exception e) {
            // rollback
            s.getTransaction().rollback();
        }
    }

    public static void main(String[] args) {
        System.out.println(new GiangVienRepository().getAll());
    }
}
