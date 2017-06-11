package com.aravinda.springDemo.domain.promotion;

import org.springframework.beans.factory.annotation.Autowired;

import com.aravinda.springDemo.domain.product.ConsumerProduct;
import com.aravinda.springDemo.domain.product.IndustrialProduct;

public class TradeFair3 {

	private IndustrialProduct industrialProduct;
	private ConsumerProduct consumerProduct;

	@Autowired
	public void setIndustrialProduct(IndustrialProduct industrialProduct) {
		this.industrialProduct = industrialProduct;
	}

	@Autowired
	public void setConsumerProduct(ConsumerProduct consumerProduct) {
		this.consumerProduct = consumerProduct;
	}

	public int declareIndustrialProductPrice(IndustrialProduct industrialProduct) {
		return industrialProduct.calculatePrice();
	}

	public int declareConsumerProductPrice(ConsumerProduct consumerProduct) {
		return consumerProduct.calculatePrice();
	}

	public String specialPromotionalPricing() {
		return "Industrial product priced at $" + declareIndustrialProductPrice(industrialProduct) + " and "
				+ "Consumer product priced at $" + declareConsumerProductPrice(consumerProduct);
	}
}