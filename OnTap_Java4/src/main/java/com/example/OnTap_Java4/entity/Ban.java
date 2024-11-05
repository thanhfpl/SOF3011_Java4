package com.example.OnTap_Java4.entity;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "Ban")
public class Ban {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "SoThich")
    private String soThich;

    @Column(name = "GioiTinh")
    private int gioiTinh;


    public Ban() {
    }

    public Ban(Long id, String ma, String ten, String soThich, int gioiTinh) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.soThich = soThich;
        this.gioiTinh = gioiTinh;
    }

    public Long getId() {
        return id;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getSoThich() {
        return soThich;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "Ban{" +
                "id=" + id +
                ", ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", soThich='" + soThich + '\'' +
                ", gioiTinh=" + gioiTinh +
                '}';
    }
}
