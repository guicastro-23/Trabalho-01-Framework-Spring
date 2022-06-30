package com.projeto.futebol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.futebol.entities.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{

}

