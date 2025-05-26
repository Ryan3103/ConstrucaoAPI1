package com.controle.estoque.controller;

import com.controle.estoque.model.Usuario;
import com.controle.estoque.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repo;

    @GetMapping
    public List<Usuario> list() {
        return repo.findAll();
    }

    @PostMapping
    public Usuario create(@RequestBody Usuario u) {
        return repo.save(u);
    }
}
