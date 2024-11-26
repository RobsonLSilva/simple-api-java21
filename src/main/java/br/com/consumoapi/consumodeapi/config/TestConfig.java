package br.com.consumoapi.consumodeapi.config;

import br.com.consumoapi.consumodeapi.entity.Telefone;
import br.com.consumoapi.consumodeapi.entity.Usuario;
import br.com.consumoapi.consumodeapi.repository.TelefoneRepository;
import br.com.consumoapi.consumodeapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private TelefoneRepository telefoneRepository;
    @Override
    public void run(String... args) throws Exception {
        Telefone t1 = new Telefone(null, "(11) 91234-4321", "celular");
        Telefone t2 = new Telefone(null, "(11) 91254-1234", "celular");
        Telefone t3 = new Telefone(null, "(11) 2134-6543)", "fixo");
        Telefone t4 = new Telefone(null, "(11) 91234-4321", "celular");



        Usuario u1 = new Usuario(null, "Robson Luiz", Instant.parse("1985-01-01T19:53:07Z"), List.of(t1));
        Usuario u2 = new Usuario(null, "Luisa Souza", Instant.parse("1990-01-01T19:53:07Z"), List.of(t2, t4));




        usuarioRepository.saveAll(Arrays.asList(u1, u2));
    }
}
