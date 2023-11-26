package withStrategyPattern;
import withStrategyPattern.stratergy.NormalDriveStratergy;

public class GoodVehicle extends Vehicle {

	GoodVehicle() {
		super(new NormalDriveStratergy());
		// TODO Auto-generated constructor stub
	}

}
