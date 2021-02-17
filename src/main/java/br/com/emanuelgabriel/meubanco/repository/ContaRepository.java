package br.com.emanuelgabriel.meubanco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.emanuelgabriel.meubanco.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

}
