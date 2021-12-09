package com.developper.tutorialrestapi.controller;

import com.developper.tutorialrestapi.model.UsuarioModel;
import com.developper.tutorialrestapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;



    @GetMapping(path = "/api/status/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo")Integer codigo){
        return usuarioRepository.findAllById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/usuario/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioModel usuarioModel){
        return usuarioModel;
    }
}
