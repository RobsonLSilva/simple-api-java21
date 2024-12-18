package br.com.consumoapi.consumodeapi.repository;

import br.com.consumoapi.consumodeapi.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
