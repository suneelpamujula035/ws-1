package net.codejava;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(length = 128, nullable = false, unique = true)
	private String name;
	
	private float price;
	
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ProductDetails> details = new ArrayList<>();

	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String name, float price, List<ProductDetails> details) {
		super();
		this.name = name;
		this.price = price;
		this.details = details;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public List<ProductDetails> getDetails() {
		return details;
	}
	public void setDetails(List<ProductDetails> details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", details=" + details + "]";
	}

	public void addDetails(String name, String value)
	{
		this.details.add(new ProductDetails(name, value, this));
	}

	public void setDetails(Integer id, String name, String value)
	{
		this.details.add(new ProductDetails(id, name, value, this));
	}
	

}
