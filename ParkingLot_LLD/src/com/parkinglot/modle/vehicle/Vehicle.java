package com.parkinglot.modle.vehicle;

public class Vehicle {
	private String LicenseNumber;
	private final VehicleType type;
	public Vehicle(String licenseNumber, VehicleType type) {
		this.LicenseNumber = licenseNumber;
		this.type = type;
	}
}
