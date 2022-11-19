package com.backendapp.backendApp.service;

import com.backendapp.backendApp.entity.Aula.AulaEntity;
import com.backendapp.backendApp.repository.AgendamentoRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService {


    @Autowired
   private AgendamentoRepository agendamentoRepository;


    public ResponseEntity<List<AulaEntity>> getAllClassByDate() {
        return agendamentoRepository.findAll();
    }

}
