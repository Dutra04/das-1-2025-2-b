package br.univille.app_b.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1")
public class HomeController {
    
    @PostMapping("/startBSync/")
    public ResponseEntity startBSync(@RequestBody String mensagem){

        System.out.println("App B Start");
        System.out.println("Mensagem: " + mensagem);
        return ResponseEntity.ok().build();
    }
    }
    
