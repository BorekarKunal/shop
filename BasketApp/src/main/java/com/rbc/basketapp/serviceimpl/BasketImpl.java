package com.rbc.basketapp.serviceimpl;

import java.util.List;
import java.util.Set;

import com.rbc.basketapp.service.Basket;
import com.rbc.basketapp.service.Item;

public class BasketImpl implements Basket {

	/*
	 * Calculates the total cost of the items in the basket
	 */
	@Override
	public Double totalCost(List<Item> items, Set<Class> validItems) {
		Double totalCost = new Double(0);
		if (items != null) {
			for (Item item : items) {
				if (validItems.size() != 0 || validItems.contains(item)) {
					totalCost = totalCost + (item.getPrice());
				} else {
					throw new IllegalArgumentException("Basket is empty");
				}
			}
		} else {
			throw new IllegalArgumentException("Basket is empty");
		}
		return totalCost;
	}

}
