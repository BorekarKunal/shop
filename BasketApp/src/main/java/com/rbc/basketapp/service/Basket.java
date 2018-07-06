package com.rbc.basketapp.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface Basket {

	Double totalCost(List<Item> items, Set<Class> validItems);
}
