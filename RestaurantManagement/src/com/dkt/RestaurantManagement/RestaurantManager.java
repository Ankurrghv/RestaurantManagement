package com.dkt.RestaurantManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class RestaurantManager {

	List<Restaurant> restaurantList = new ArrayList<Restaurant>();
	List<Customer> cus = new ArrayList<Customer>();

	public Customer addCustomer(Customer cus) {
		this.cus.add(cus);
		return cus;

	}

	public Restaurant addRestaurant(Restaurant rs) {
		restaurantList.add(rs);
		return rs;
	}

	public Restaurant getNewRestaurant(Customer id1) {
		List<Restaurant> x = id1.getVistedRestaurants();
		ListIterator<Restaurant> it1 = restaurantList.listIterator();

		while (it1.hasNext()) {
			Restaurant t = it1.next();
			if (x.contains(t) == false) {
				return t;
			}
		}
		return null;
		

		// TODO Auto-generated method stub

	}
	public void printAllRestaurants(){
		ListIterator<Restaurant> it1= restaurantList.listIterator();
		while(it1.hasNext()){
			it1.next().printName();
		}
		
	}

}
