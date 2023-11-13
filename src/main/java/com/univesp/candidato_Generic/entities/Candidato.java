package com.univesp.candidato_Generic.entities;

import com.univesp.candidato_Generic.dto.CandidatoDTO;
import com.univesp.candidato_Generic.util.Convertible;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_candidato")
public class Candidato implements Comparable<CandidatoDTO>, Convertible<CandidatoDTO> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int codigo_votacao;
    private String nome_candidato;
    private String partido;
    private int votos;
    private int votoTotal;
    private LocalDateTime dataParaComecar;
    private LocalDateTime dataParaFinalizar;
    private Boolean finalizado = false;

    public Candidato() {
    }

    public Candidato(Long id, int codigo_votacao, String nome_candidato, String partido, int votos, int votoTotal) {
        this.codigo_votacao = codigo_votacao;
        this.nome_candidato = nome_candidato;
        this.partido = partido;
        this.votos = votos;
        this.votoTotal = votoTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCodigo_votacao() {
        return codigo_votacao;
    }

    public void setCodigo_votacao(int codigo_votacao) {
        this.codigo_votacao = codigo_votacao;
    }

    public String getNome_candidato() {
        return nome_candidato;
    }

    public void setNome_candidato(String nome_candidato) {
        this.nome_candidato = nome_candidato;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getVotoTotal() {
        return votoTotal;
    }

    public void setVotoTotal(int votoTotal) {
        this.votoTotal = votoTotal;
    }

    @Override
    public int compareTo(CandidatoDTO o) {
        return 0;
    }

    @Override
    public CandidatoDTO convert() {
        return new CandidatoDTO(this);
    }
}

