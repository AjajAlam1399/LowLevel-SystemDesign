package ObserverPattern.Observeable;

import java.util.ArrayList;
import java.util.List;

import ObserverPattern.Observer.NotificationAlertObserver;

public class IphoneObservableImp implements StockObservable {
	
	private List<NotificationAlertObserver>obseverList=new ArrayList<>();
	int currstock=0;

	@Override
	public void add(NotificationAlertObserver obj) {
		// TODO Auto-generated method stub
		obseverList.add(obj);	}

	@Override
	public void remove(NotificationAlertObserver obj) {
		// TODO Auto-generated method stub
		obseverList.remove(obj);
	}

	@Override
	public void Notify() {
		// TODO Auto-generated method stub
		for(NotificationAlertObserver obs:obseverList) {
			obs.update();
		}
	}

	@Override
	public void setStock(int stock) {
		// TODO Auto-generated method stub
		if(currstock==0) {
			Notify();
		}
		currstock+=stock;
		
	}

	@Override
	public int getStock() {
		// TODO Auto-generated method stub
		return currstock;
	}

}
