package com.example.demo3.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Table(name = "SanPham")

public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSanPham")
    private Long idSanPham123;

    @Column(name = "maSanPham")
    private String maSanPham;

    @Column(name = "tenSanPham")
    private String tenSanPham;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "createdBy")
    private Long createdBy;

    @Column(name = "updatedAt")
    private Date updatedAt;

    @Column(name = "updatedBy")
    private Long updatedBy;


    public SanPham() {
    }

    public SanPham(Long idSanPham123, String maSanPham, String tenSanPham, Date createdAt, Long createdBy, Date updatedAt, Long updatedBy) {
        this.idSanPham123 = idSanPham123;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public Long getIdSanPham123() {
        return idSanPham123;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }


    public void setIdSanPham123(Long idSanPham123) {
        this.idSanPham123 = idSanPham123;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }


    @Override
    public String toString() {
        return "SanPham{" +
                "idSanPham123=" + idSanPham123 +
                ", maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", createdAt=" + createdAt +
                ", createdBy=" + createdBy +
                ", updatedAt=" + updatedAt +
                ", updatedBy=" + updatedBy +
                '}';
    }
}
