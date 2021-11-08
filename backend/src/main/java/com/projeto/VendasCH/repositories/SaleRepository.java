package com.projeto.VendasCH.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.VendasCH.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
