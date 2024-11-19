package br.com.consumoapi.consumodeapi.controller;

import br.com.consumoapi.consumodeapi.entity.Usuario;
import br.com.consumoapi.consumodeapi.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    // Injeção de dependencia (UsuarioService)
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public void salvar(@RequestBody Usuario usuario){
        usuarioService.salvar(usuario);
    }

    @GetMapping
    public List<Usuario> buscarTodos(){
        return usuarioService.buscarTodos();
    }
    @GetMapping("{id}")
    public Usuario buscarPorId(@PathVariable Long id){
        return usuarioService.buscarPorId(id);
    }
}
