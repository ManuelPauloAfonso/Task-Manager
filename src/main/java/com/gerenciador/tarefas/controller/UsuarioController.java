package com.gerenciador.tarefas.controller;

import com.gerenciador.tarefas.entity.Usuario;
import com.gerenciador.tarefas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> salvarUsuario(@RequestBody Usuario usuario) {
        Usuario savedUsuario = usuarioService.salvarUsuario(usuario);
        return new ResponseEntity<>(savedUsuario, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Usuario> atualizarUsuario(@RequestBody Usuario usuario) {
        Usuario updatedUsuario = usuarioService.atualizarUsuario(usuario);
        return new ResponseEntity<>(updatedUsuario, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> obterUsuarios() {
        List<Usuario> usuarios = usuarioService.obterUsuarios();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Void> excluirUsuario(@RequestBody Usuario usuario) {
        usuarioService.excluirUsuario(usuario);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
