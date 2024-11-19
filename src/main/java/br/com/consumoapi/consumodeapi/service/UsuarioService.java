package br.com.consumoapi.consumodeapi.service;

import br.com.consumoapi.consumodeapi.entity.Usuario;
import br.com.consumoapi.consumodeapi.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsuarioService {

    // Injeção de dependência (UsuarioRepository)
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void salvar(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public void deletar(Usuario usuario){
        usuarioRepository.delete(usuario);
    }

    public List<Usuario> buscarTodos(){
        return usuarioRepository.findAll();
    }

    public Usuario buscarPorId(Long id){
        return usuarioRepository.findById(id).orElse(null);
    }


}
