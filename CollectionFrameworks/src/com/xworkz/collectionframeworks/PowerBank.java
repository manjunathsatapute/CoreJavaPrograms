package com.xworkz.collectionframeworks;

public class PowerBank {
	
	private int batteryCapacity;
	private int noOfPorts;
	private String brand;
	private double price;

	public PowerBank(int batteryCapacity, int noOfPorts, String brand, double price) {
		this.batteryCapacity = batteryCapacity;
		this.noOfPorts = noOfPorts;
		this.brand = brand;
		this.price = price;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getNoOfPorts() {
		return noOfPorts;
	}

	public void setNoOfPorts(int noOfPorts) {
		this.noOfPorts = noOfPorts;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PowerBank [batteryCapacity=" + batteryCapacity + ", noOfPorts=" + noOfPorts + ", brand=" + brand
				+ ", price=" + price + "]";
	}
	
}
