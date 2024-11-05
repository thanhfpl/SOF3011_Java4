package com.example.demo1.entity;

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

@Entity // BAT CU 1 CLASS NAO TRONG ENTITY => DEU PHAI DANH DAU LA THUC THE
@Table(name = "giang_vien") // name: ten bang trong SQL
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class GiangVien1 {
    // J3: JDBC => Truy van sql
    // J4: Hibernate => Truy van dua HQL(Hibernate Query Langague)
    // => Truy van dua vao cac class trong entity(thuc the)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id2343;

    @Column(name = "mssv")
    private String mssv1;

    @Column(name = "ten")
    private String ten;

    @Column(name = "tuoi")
    private Long tuoi;

    @Column(name = "gioi_tinh")
    private Boolean gioiTinh;

    @Column(name = "que_quan")
    private String queQuan;

}
