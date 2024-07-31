package com.saretto.propostaapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PropostaRequestDto {

    private String nome;

    private String sobremesa;

    private String telefone;

    private String cpf;

    private Double renda;

    private Double valorSolicitado;

    private int prazoPagamento;



}