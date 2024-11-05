package com.example.ThiThu_Java4.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = ("SanPham"))
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Ma")
    private String ma;;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "NgaySX")
    private Date ngaySanXuat;

    @Column(name = "Mota")
    private String moTa;

    @Column(name = "Website")
    private String webSite;

    @Column(name = "GiaBan")
    private float giaBan;

    @Column(name = "SoLuong")
    private int soLuong;

    public SanPham() {
    }

    public SanPham(Long id, String ma, String ten, Date ngaySanXuat, String moTa, String webSite, float giaBan, int soLuong) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.ngaySanXuat = ngaySanXuat;
        this.moTa = moTa;
        this.webSite = webSite;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
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

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public String getMoTa() {
        return moTa;
    }

    public String getWebSite() {
        return webSite;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public int getSoLuong() {
        return soLuong;
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

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
