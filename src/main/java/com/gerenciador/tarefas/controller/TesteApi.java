package com.gerenciador.tarefas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteApi {
    @GetMapping("/test-api")
    private String teste()  { return "sucesso";
    }


}
