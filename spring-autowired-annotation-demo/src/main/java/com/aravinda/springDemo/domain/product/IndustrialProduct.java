package com.aravinda.springDemo.domain.product;

import java.util.Random;

public class IndustrialProduct extends GenericProduct {

	@Override
	public int calculatePrice() {
		Random random = new Random();
		return random.nextInt(priceRandomizer);
	}

}
