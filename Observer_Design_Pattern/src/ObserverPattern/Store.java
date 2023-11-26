package ObserverPattern;
import ObserverPattern.Observeable.IphoneObservableImp;
import ObserverPattern.Observeable.StockObservable;
import ObserverPattern.Observer.EmailNotificationImp;
import ObserverPattern.Observer.MobileNotificationImp;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockObservable iphoneObservable=new IphoneObservableImp();
		NotificationAlertObserver observer1=new EmailNotificationImp("ajajalam3811@gmail.com",iphoneObservable);
		NotificationAlertObserver observer2=new MobileNotificationImp("93042959858",iphoneObservable);
		
		iphoneObservable.add(observer2);
		iphoneObservable.add(observer1);
		
		iphoneObservable.setStock(10);
		iphoneObservable.setStock(10);
	}

}
