package com.pr.demoPR.model;

public class CursoModel {

	private String name;
	private String description;
	private int price;
	private int hours;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public CursoModel(String name, String description, int price, int hours) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.hours = hours;
	}

	public CursoModel() {

	}

}
