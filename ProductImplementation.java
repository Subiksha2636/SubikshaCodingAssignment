package com.subis.day7;


import java.util.*;
//set 9

class Product implements Comparable  {
	int id;
	String name;
	int price;
	
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
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
	public int  getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int compareTo(Object o) {
		Product p=(Product)o;
		if(this.getPrice()>p.getPrice())
			return 1;
		else if(this.getPrice()<p.getPrice())
			return -1;
		else
			return 0;
	}
}
public class ProductImplementation {
	double  sumOfPrice(ArrayList<Product> pl) {
		double sum=0;
		Iterator<Product> i=pl.iterator();
		while(i.hasNext())
		{
			Product p=(Product)i.next();
			sum=sum+p.getPrice();	
		}
		return sum;
		
		
		
	}
	public float maxprice(ArrayList<Product> pl)
	 {
		return (float)Collections.max(pl).getPrice();
	 }
	 
	 public float minprice(ArrayList<Product> pl)
	 {
		return (float)Collections.min(pl).getPrice();
	 }
	 
	
	 public List<String> getProductNameList(ArrayList<Product> pl)
	 {
		List<String> l=new ArrayList<String>();
		Iterator i=pl.iterator();
			while(i.hasNext())
				l.add(((Product)i.next()).getName());
			return l;
	 }
	
	public static void main(String[] args) {
		ArrayList plist=new ArrayList<Product>();
		plist.add(new Product(20,"Bag",897));
		plist.add(new Product(21,"Book",87));
		plist.add(new Product(22,"Table",89));
		plist.add(new Product(23,"pen",597));
		System.out.println(plist);
		ProductImplementation pa=new ProductImplementation();
		
		System.out.println(pa.getProductNameList(plist));
	System.out.println(pa.sumOfPrice(plist));
		System.out.println(pa.maxprice(plist));
		
	}
}
