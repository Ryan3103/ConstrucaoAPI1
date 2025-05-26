package com.controle.estoque.controller;

import com.controle.estoque.model.Produto;
import com.controle.estoque.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository repo;

    @GetMapping
    public List<Produto> list() {
        return repo.findAll();
    }

    @PostMapping
    public Produto create(@RequestBody Produto p) {
        return repo.save(p);
    }
}
