package com.dkt.RestaurantManagement;

import java.util.ArrayList;
import java.util.List;

public class Rtms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RestaurantManager rn=new RestaurantManager();
		Customer id1=rn.addCustomer(new Customer("ankur"));
		Restaurant r1 =rn.addRestaurant(new Restaurant("Radison"));
		
		
		Restaurant r2=rn.addRestaurant(new Restaurant("taj" ));
		Restaurant rc =rn.getNewRestaurant(id1);
		id1.vistedRestaurant(rc);
		// TODO Auto-generated method stub
		rn.printAllRestaurants();
		id1.printVistedRestaurants();

	}

}
