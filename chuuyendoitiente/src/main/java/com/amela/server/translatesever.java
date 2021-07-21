package com.amela.server;

import java.util.HashMap;
import java.util.Map;

public class translatesever {
    private  static Map<String,String> dictonary = new HashMap<>();
    static {
        dictonary.put("hello", "xin chào");
        dictonary.put("book", "Sách");
        dictonary.put("how", "thế nào");
        dictonary.put("why", "tại sao");
    }
    public String translate(String dis){
        return dictonary.get(dis);
    }



}
