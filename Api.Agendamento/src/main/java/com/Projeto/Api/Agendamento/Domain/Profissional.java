package com.Projeto.Api.Agendamento.Domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

public class Profissional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    UUID id;

    private String nome;
    private String especialidade;
}
