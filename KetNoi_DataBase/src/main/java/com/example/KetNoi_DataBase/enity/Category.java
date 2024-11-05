package com.example.KetNoi_DataBase.enity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "category") // ten cua table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Category  {
    /**
     *  J3: JDBC (Java DateBase Connecttitivy ) => truy van cau lech trong sql
     *  J4:  Hibernate :
     *       1. truy van cac cau lech trong sql
     *       2. truy van cau lech thuc the (HQL - Hibernete  Query Langue ) => truy van tren class
     *  J5: JAP
     *       1. Truy van cau lech SQL  : native query
     *       2. Truy van cau lech thuc the (JSQL  - JSP Query Langue ) => truy van  tren class
     *  ORM (obeject Relattinon  mapping ) Mapping tu bang = > thanh class
     *
     *  1. Mapping table => thuc the
     *        1. class => table
     *        thuoc tinh => colum cua table : khoa chinh, khoa ngoai, cot binnh thuong
     *
     *  2. RelationShip
     *       1 - 1 : One to one
     *       1 - N : One to Many
     *       N - 1 : Many to one
     *       N - N : Many to Many => xy ly trong sql
     *       1 Categỏy => N Product
     *       1 Product => 1 Category
     *       => Nhieu => Product
     *       => Chỉ cần maping 1 chiều là được.
     *
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id123;

    @Column(name = "category_code")
    private String categoryCode;

    @Column(name = "category_name")
    private String categoryName;


}
