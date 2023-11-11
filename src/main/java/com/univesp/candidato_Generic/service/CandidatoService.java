package com.univesp.candidato_Generic.service;

import com.univesp.candidato_Generic.dto.CandidatoDTO;
import com.univesp.candidato_Generic.entities.Candidato;
import com.univesp.candidato_Generic.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CandidatoService implements GenericService<Candidato, CandidatoDTO, Long> {
    @Autowired
    private CandidatoRepository repository;

    @Override
    public JpaRepository<Candidato, Long> getRepository(){
        return repository;
    }
}
