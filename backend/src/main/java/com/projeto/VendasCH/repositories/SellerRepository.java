package com.projeto.VendasCH.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.VendasCH.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
