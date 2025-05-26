package com.controle.estoque.controller;

import com.controle.estoque.model.Saida;
import com.controle.estoque.repository.SaidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/saidas")
public class SaidaController {
    @Autowired
    private SaidaRepository repo;

    @GetMapping
    public List<Saida> list() {
        return repo.findAll();
    }

    @PostMapping
    public Saida create(@RequestBody Saida s) {
        return repo.save(s);
    }
}
