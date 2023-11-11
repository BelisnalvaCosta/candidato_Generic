package com.univesp.candidato_Generic.controller;

import com.univesp.candidato_Generic.dto.CandidatoDTO;
import com.univesp.candidato_Generic.service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping(value = "/candidatos")
public class CandidatoController {    

    @Autowired
    private CandidatoService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<CandidatoDTO> findById(@PathVariable Long id){
        CandidatoDTO obj = service.findById(id);
        return ResponseEntity.ok(obj);
    }

    @GetMapping
    public ResponseEntity<List<CandidatoDTO>> findAll() {
        List<CandidatoDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }
}
