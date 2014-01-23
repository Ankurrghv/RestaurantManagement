package com.dkt.RestaurantManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Customer {
	List<Restaurant> rv= new ArrayList<Restaurant>();
protected String customerName;
public String getCustomerName() {
	return customerName;
}
public List<Restaurant> getVistedRestaurants(){
	return rv;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public Customer(String cn){
	this.customerName=cn;
}
public void vistedRestaurant(Restaurant rc) {
	rv.add(rc);
	// TODO Auto-generated method stub
	
}
public void printVistedRestaurants(){
	ListIterator<Restaurant> it1= rv.listIterator();
	while(it1.hasNext()){
		it1.next().printName();
	}
	
}



}
