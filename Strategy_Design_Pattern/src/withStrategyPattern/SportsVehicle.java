package withStrategyPattern;

import withStrategyPattern.stratergy.SportsDriveStratergy;

public class SportsVehicle extends Vehicle {

	SportsVehicle() {
		super(new SportsDriveStratergy());
	}
}
