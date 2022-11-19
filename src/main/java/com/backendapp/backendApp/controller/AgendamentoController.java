package com.backendapp.backendApp.controller;


import com.backendapp.backendApp.entity.Aula.AulaEntity;
import com.backendapp.backendApp.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    @Autowired
     private AgendamentoService agendamentoService;


    @GetMapping("/horarios/{dias}")
    public ResponseEntity<List<AulaEntity>> getAllClassByDate(HttpServletRequest httpServletRequest, @PathVariable Date dias) {
        return agendamentoService.;

    }
}
