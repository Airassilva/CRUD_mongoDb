package org.example.telefonica.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

    @Autowired
    private ContatoRepositorio contatoRepositorio;

    @GetMapping
    public List<Contato> listarTodos() {
        return contatoRepositorio.findAll();
    }

    @PostMapping
    public Contato criar(@RequestBody Contato contato) {
        return contatoRepositorio.save(contato);
    }
}
