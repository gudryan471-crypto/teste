package br.com.senai.aberturaordensservico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.aberturaordensservico.model.Setor;

public interface SetorRepository 
        extends JpaRepository<Setor, Integer> {

        }
