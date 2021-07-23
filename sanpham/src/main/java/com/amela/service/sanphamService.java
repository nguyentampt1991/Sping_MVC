package com.amela.service;

import com.amela.model.sanpham;

import java.util.*;
import java.util.stream.Collectors;

public class sanphamService implements ISanPham{
    private static List<sanpham> listSanPham;
    private  static final Map<Integer,sanpham> sanPs ;
    static {
        sanPs = new HashMap<>();
        sanPs.put(1,new sanpham(1,"thuốc lá",10000,"có hại cho sức khỏe","vinataba"));
        sanPs.put(2,new sanpham(2,"bánh mỳ",5000,"làm từ lúa mạch","kinh đô"));
        sanPs.put(3,new sanpham(3,"thuốc lá",10000,"có hại cho sức khỏe","vinataba"));
        sanPs.put(4,new sanpham(4,"thuốc lá",10000,"có hại cho sức khỏe","vinataba"));
        sanPs.put(5,new sanpham(5,"thuốc lá",10000,"có hại cho sức khỏe","vinataba"));
        sanPs.put(6,new sanpham(6,"thuốc lá",10000,"có hại cho sức khỏe","vinataba"));

    }
    @Override
    public List<sanpham> findAll() {
        return new ArrayList<>(sanPs.values());
    }

    @Override
    public void save(sanpham sanP) {
        sanPs.put(sanP.getId(), sanP);
    }

    @Override
    public void update(int id, sanpham sanP) {
        sanPs.put(id, sanP);
    }

    @Override
    public void remove(int id) {
        sanPs.remove(id);
    }

    @Override
    public sanpham findById(int id) {
        return sanPs.get(id);
    }

    @Override
    public List<sanpham> search(String tuKhoa) {
        sanpham sanP = new sanpham();

        if(tuKhoa!= sanP.getTenSanPham())
        {
            System.out.println(" Không tìm thấy sản phẩm");
        }
            return  (List<sanpham>) listSanPham.stream().filter(p->p.getTenSanPham().toLowerCase(Locale.ROOT).contains(tuKhoa.toLowerCase(Locale.ROOT))).collect(Collectors.toList());

    }


}
