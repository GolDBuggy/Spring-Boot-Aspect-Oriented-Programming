package com.javasource.aop.service;

import org.springframework.stereotype.Service;


@Service
public class IkinciMessageService {

    public void mesaj(String param) {
        System.out.println("Metod ikinci mesajı verdi: "+param);
    }
}