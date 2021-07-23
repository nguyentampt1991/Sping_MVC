package com.amela.service;

import com.amela.model.sanpham;

import java.util.ArrayList;
import java.util.List;

public interface ISanPham {
    List<sanpham> findAll();
    void save(sanpham sanP);
    void update (int id, sanpham sanP);
    void remove(int id);
    sanpham findById(int id);


    List<sanpham> search(String tuKhoa);
}
