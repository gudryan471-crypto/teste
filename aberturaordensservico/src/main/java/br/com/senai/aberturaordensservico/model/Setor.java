package br.com.senai.aberturaordensservico.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "setor")
public class Setor {

@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

private String nome;

public Setor() {
}

public Integer getId() {
    return id;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}
}
