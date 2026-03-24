package com.junior.crud.service;

import com.junior.crud.entity.Categoria;
import com.junior.crud.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }

    public Categoria salvar(Categoria categoria) {
        return repository.save(categoria);
    }

    public List<Categoria> listarTodos() {
        return repository.findAll();
    }

    public Categoria buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}