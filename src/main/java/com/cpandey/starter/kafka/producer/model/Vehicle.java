package com.cpandey.starter.kafka.producer.model;

public class Vehicle {

	private String modelName;
	private String color;

	public Vehicle() {}

	public Vehicle(String modelName, String color) {
		this.modelName = modelName;
		this.color = color;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return String.format(
				"Vehicle[modelName='%s', color='%s']",
				modelName, color);
	}

}

