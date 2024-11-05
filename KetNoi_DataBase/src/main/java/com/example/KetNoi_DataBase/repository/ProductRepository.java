package com.example.KetNoi_DataBase.repository;

import com.example.KetNoi_DataBase.config.HibernateConfig;
import com.example.KetNoi_DataBase.enity.Product;
import org.hibernate.Session;

import java.util.List;

public class ProductRepository {

    List<Product>getAll() {
        Session s = HibernateConfig.getFACTORY().getCurrentSession();
        List<Product> lists = s.createQuery("FROM Product").list();
        return lists;
    }


    public static void main(String[] args) {
        System.out.println(new ProductRepository().getAll());
    }
}
