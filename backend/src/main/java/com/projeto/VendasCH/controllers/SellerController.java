package com.projeto.VendasCH.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.VendasCH.dto.SellerDTO;
import com.projeto.VendasCH.service.SellerService;

@RestController
@RequestMapping(value = "/sellers") 
public class SellerController {

	@Autowired 
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO >> FindAll(){
			List<SellerDTO> list = service.FindAll();
			return ResponseEntity.ok(list);
	}	
}
