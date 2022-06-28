package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cartName;
	public Cart() {
		// TODO Auto-generated constructor stub
	}
	public Cart(String cartName) {
		super();
		this.cartName = cartName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCartName() {
		return cartName;
	}
	public void setCartName(String cartName) {
		this.cartName = cartName;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", cartName=" + cartName + "]";
	}
}
