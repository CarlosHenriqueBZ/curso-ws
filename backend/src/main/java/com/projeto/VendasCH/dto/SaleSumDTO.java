package com.projeto.VendasCH.dto;

import java.io.Serializable;

import com.projeto.VendasCH.entities.Seller;

public class SaleSumDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
		private String sellername;
		private Double soma;
		
		
		
		public SaleSumDTO() {
		}

		public SaleSumDTO(Seller seller, Double soma) {
		
			this.sellername = seller.getName();
			this.soma = soma;
		}

		public String getSellername() {
			return sellername;
		}

		public void setSellername(String sellername) {
			this.sellername = sellername;
		}

		public Double getSoma() {
			return soma;
		}

		public void setSoma(Double soma) {
			this.soma = soma;
		}
		
		
		
}
