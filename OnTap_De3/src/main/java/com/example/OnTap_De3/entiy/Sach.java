package com.example.OnTap_De3.entiy;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "Sach")
public class Sach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "NgayXuatBan")
    private Date ngayXuatBan;

    @Column(name = "SoTrang")
    private int soTrang;

    @Column(name = "DonGia")
    private float donGia;

    @Column(name = "IdNXB")
    private int idNhaXuatBan;


    public Sach() {
    }


    public Sach(Long id, String ma, String ten, Date ngayXuatBan, int soTrang, float donGia, int idNhaXuatBan) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.ngayXuatBan = ngayXuatBan;
        this.soTrang = soTrang;
        this.donGia = donGia;
        this.idNhaXuatBan = idNhaXuatBan;
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

    public Date getNgayXuatBan() {
        return ngayXuatBan;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public float getDonGia() {
        return donGia;
    }

    public int getIdNhaXuatBan() {
        return idNhaXuatBan;
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

    public void setNgayXuatBan(Date ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public void setIdNhaXuatBan(int idNhaXuatBan) {
        this.idNhaXuatBan = idNhaXuatBan;
    }
}
