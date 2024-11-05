package com.example.KetNoi_DataBase.repository;

import com.example.KetNoi_DataBase.config.HibernateConfig;
import com.example.KetNoi_DataBase.enity.Category;
import jakarta.persistence.Query;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CategoryRepository {

    // crud: CRAETE /READ/ UPDATE/ DATELE

    // GET ALL

    public List<Category> getAll(){
        Session s= HibernateConfig.getFACTORY().openSession();// Mo phien session
        List<Category> lists = s.createQuery("FROM Category").list();
        return lists;
    }


    //GET ONE

    public Category getOne(Long id){
        Session s = HibernateConfig.getFACTORY().openSession(); //Mo Phien session
        String sql  = "FROM  Category WHERE id123= :id";
        Query q = s.createQuery(sql);
        q.setParameter(1, id);
        return (Category) q.getSingleResult(); //CHi tra ra du lieu 1 dong
    }

    // add => presit
    public void add(Category c) {
        Transaction tran = null;
        try{
            Session s = HibernateConfig.getFACTORY().openSession();
            tran =s.beginTransaction();
            s.persist(c);
            tran.commit();

        }catch (Exception e) {
            e.printStackTrace();

        }
    }


    // update  => merge
    public void merge(Category m) {
        Transaction tran = null;
        try{
            Session s = HibernateConfig.getFACTORY().openSession();
            tran =s.beginTransaction();
            s.persist(m);
            tran.commit();

        }catch (Exception e) {
            e.printStackTrace();

        }
    }


    // detele => Detele
    public void detele(Category c) {
        Transaction tran = null;
        try{
            Session s = HibernateConfig.getFACTORY().openSession();
            tran =s.beginTransaction();
            s.persist(c);
            tran.commit();

        }catch (Exception e) {
            e.printStackTrace();

        }
    }





    public static void main(String[] args) {
        System.out.println(new CategoryRepository().getAll());
    }
}
