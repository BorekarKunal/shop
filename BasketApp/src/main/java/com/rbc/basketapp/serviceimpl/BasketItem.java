package com.rbc.basketapp.serviceimpl;

import com.rbc.basketapp.service.Item;

public class BasketItem implements Item {

	private Double price;

	public BasketItem(Double price) {
		if (price == null || price < 0)
			throw new IllegalArgumentException("Price should be non-negative");
		this.price = price;
	}

	public Double getPrice() {
		return price;
	}
}

class Banana extends BasketItem {

	public Banana(Double price) {
		super(price);
	}

}

class Orange extends BasketItem {

	public Orange(Double price) {
		super(price);
	}
}

class Apple extends BasketItem {

	public Apple(Double price) {
		super(price);
	}
}

class Lemon extends BasketItem {

	public Lemon(Double price) {
		super(price);
	}
}

class Peach extends BasketItem {

	public Peach(Double price) {
		super(price);
	}
}

class Strawberry extends BasketItem {

	public Strawberry(Double price) {
		super(price);
	}

}