package br.com.carrinhocompras.loja.models;

import java.math.BigDecimal;

public class PaymentData {

	private BigDecimal value;

	public PaymentData(BigDecimal value) {
		super();
		this.value = value;
	}
	
	public BigDecimal getValue() {
		return value;
	}

}
