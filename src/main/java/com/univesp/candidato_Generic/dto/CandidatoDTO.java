package com.univesp.candidato_Generic.dto;

import com.univesp.candidato_Generic.entities.Candidato;

public class CandidatoDTO {
    private Long id;
    private int codigo_votacao;
    private String nome_candidato;
    private String partido;
    private int votoTotal;

    public CandidatoDTO(){
    }

    public CandidatoDTO(Long id, int codigo_votacao, String nome_candidato, String partido, int votoTotal) {
        super();
        this.id = id;
        this.codigo_votacao = codigo_votacao;
        this.nome_candidato = nome_candidato;
        this.partido = partido;
        this.votoTotal = votoTotal;
    }

    public CandidatoDTO(Candidato entity){
        super();
        this.id = entity.getId();
        this.codigo_votacao = entity.getCodigo_votacao();
        this.nome_candidato = entity.getNome_candidato();
        this.partido = entity.getPartido();
        this.votoTotal = entity.getVotoTotal();
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

    public int getVotoTotal() {
        return votoTotal;
    }

    public void setVotoTotal(int votoTotal) {
        this.votoTotal = votoTotal;
    }
}
