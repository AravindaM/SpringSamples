package com.aravinda.springDemo.domain.promotion;

import org.springframework.beans.factory.annotation.Autowired;

import com.aravinda.springDemo.domain.product.ConsumerProduct;
import com.aravinda.springDemo.domain.product.IndustrialProduct;

public class TradeFair {

	private IndustrialProduct industrialProduct;
	private ConsumerProduct consumerProduct;

	
	public TradeFair() {
	
	}

	@Autowired
	public TradeFair(IndustrialProduct industrialProduct, ConsumerProduct consumerProduct) {
		super();
		this.industrialProduct = industrialProduct;
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

//No Need @Autowired for Constructor, if there is only one Constructor. Spring 4.3