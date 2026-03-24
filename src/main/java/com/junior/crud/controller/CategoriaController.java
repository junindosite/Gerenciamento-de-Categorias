package com.junior.crud.controller;

import com.junior.crud.entity.Categoria;
import com.junior.crud.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaService service;

    public CategoriaController(CategoriaService service) {
        this.service = service;
    }

    @PostMapping("/salvar")
    public Categoria salvar(@RequestBody Categoria categoria) {
        return service.salvar(categoria);
    }

    @GetMapping("/lisar")
    public List<Categoria> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Categoria buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}