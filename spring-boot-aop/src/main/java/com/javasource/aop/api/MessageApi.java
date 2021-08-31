package com.javasource.aop.api;

import com.javasource.aop.service.IkinciMessageService;
import com.javasource.aop.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageApi {

    @Autowired
    private MessageService messageService;
    @Autowired
    private IkinciMessageService ikinciMesajService;

    @PostMapping
    public ResponseEntity<String> ornekMethod(@RequestBody String message) {
        ikinciMesajService.mesaj(message);
        return ResponseEntity.ok(messageService.mesajVer(message));
    }
}