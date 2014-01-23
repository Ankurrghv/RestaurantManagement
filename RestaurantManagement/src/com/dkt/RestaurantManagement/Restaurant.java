package com.dkt.RestaurantManagement;

public class Restaurant {
	protected int id;
	protected String name;
	public Restaurant(int id){
		this.id=id;
	
	}
	public Restaurant(String name){
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void printName() {
		System.out.println(this.name);
		// TODO Auto-generated method stub
		
	}

}
