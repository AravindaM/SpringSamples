package com.aravinda.springDemo.domain.promotion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aravinda.springDemo.domain.product.ConsumerProduct;
import com.aravinda.springDemo.domain.product.IndustrialProduct;

@Component("tradeFair")
public class TradeFair {

	@Autowired
	private IndustrialProduct industrialProduct;
	@Autowired
	private ConsumerProduct consumerProduct;


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