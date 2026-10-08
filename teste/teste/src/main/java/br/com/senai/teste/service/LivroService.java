package br.com.senai.teste.service;

import java.nio.file.OpenOption;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.senai.teste.model.Livro;

import br.com.senai.teste.repository.LivroRepository;
import io.micrometer.common.annotation.NoOpValueResolver;

@Service 
public class LivroService {
    
    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public Livro cadastrar(Livro livro) {
        return livroRepository.save(livro);
    }

    public List<Livro> listar() {
        return livroRepository.findAll();
    }

    public Optional<Livro> buscarPorId(Integer id) {
        return livroRepository.findById(id);
    }

    public Optional<Livro> atualizar(
        Integer id, Livro novosDados) {
    
    Optional<Livro> livroEncontrado = livroRepository.findById(id);

    if (livroEncontrado.isEmpty()) {
        return Optional.empty();
    }

    Livro livro = livroEncontrado.get();

    livro.setTitulo(novosDados.getTitulo());
    livro.setAutor(novosDados.getAutor());
    livro.setAnoPublicacao(novosDados.getAnoPublicacao());

        return Optional.of(livroRepository.save(livro));
        }
    
}
