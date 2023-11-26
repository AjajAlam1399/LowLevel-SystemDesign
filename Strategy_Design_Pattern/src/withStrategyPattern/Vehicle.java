package withStrategyPattern;

import withStrategyPattern.stratergy.DriveStratergy;

public class Vehicle {
	DriveStratergy driveStratergy;
	Vehicle(DriveStratergy obj) {
		this.driveStratergy=obj;
	}
	public void drive() {
		driveStratergy.drive();
	}
}
