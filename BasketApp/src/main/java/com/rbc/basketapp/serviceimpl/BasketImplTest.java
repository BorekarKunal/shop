package com.rbc.basketapp.serviceimpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.rbc.basketapp.service.Basket;
import com.rbc.basketapp.service.Item;

import junit.framework.TestCase;

public class BasketImplTest extends TestCase {

	Basket basket;
	Set<Class> validItems;

	@Before
	public void setUp() {
		basket = new BasketImpl();
		validItems = new HashSet<>();
		validItems.add(Orange.class);
		validItems.add(Banana.class);
		validItems.add(Apple.class);
		validItems.add(Lemon.class);
		validItems.add(Peach.class);
	}

	@Test
	public void testBasketTotalCost() {
		List<Item> items = new ArrayList<>();
		items.add(new Banana(new Double(2.98)));
		items.add(new Peach(new Double(5.12)));
		items.add(new Apple(new Double(9.76)));
		Double totalCost = basket.totalCost(items, validItems);
		assertEquals(17.86, totalCost);
	}


	@Test(expected = IllegalArgumentException.class)
	public void testBasketTotalCostWithWrongItems() {
		List<Item> items = new ArrayList<>();
		items.add(new Banana(new Double(2.98)));
		items.add(new Strawberry(new Double(5.12)));
	}

	

}
