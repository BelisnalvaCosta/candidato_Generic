package com.univesp.candidato_Generic.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class CandidatoTODO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int codigo_votacao;
    private String nome_candidato;
    private String partido;
    private int votos;
    private int votoTotal;
    private LocalDateTime dataParaComecar;
    private LocalDateTime dataParaFinalizar;
    private Boolean finalizado = false;


    public CandidatoTODO(Integer id, int codigo_votacao, String nome_candidato, String partido, int votos, int votoTotal, LocalDateTime dataParaComecar, LocalDateTime dataParaFinalizar, Boolean finalizado) {
        this.id = id;
        this.codigo_votacao = codigo_votacao;
        this.nome_candidato = nome_candidato;
        this.partido = partido;
        this.votos = votos;
        this.votoTotal = votoTotal;
        this.dataParaComecar = dataParaComecar;
        this.dataParaFinalizar = dataParaFinalizar;
        this.finalizado = finalizado;
    }

}
