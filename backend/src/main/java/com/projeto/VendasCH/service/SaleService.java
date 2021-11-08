package com.projeto.VendasCH.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.projeto.VendasCH.dto.SaleDTO;
import com.projeto.VendasCH.entities.Sale;
import com.projeto.VendasCH.repositories.SaleRepository;
import com.projeto.VendasCH.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	@Autowired
	private SellerRepository sellerRepository;
	
	
	public Page<SaleDTO> FindAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}

}

