package ObserverPattern.Observer;

import ObserverPattern.Observeable.StockObservable;

public class EmailNotificationImp implements NotificationAlertObserver {
	
	private String email;
	private StockObservable stobs;
	
	public EmailNotificationImp(String email,StockObservable obj) {
		// TODO Auto-generated constructor stub
		this.email=email;
		this.stobs=obj;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendNotification(email,"Notification send to");
	}
	
	private void sendNotification(String email,String msg) {
		System.out.println(msg+": "+email);
	}

}
