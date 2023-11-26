package ObserverPattern.Observer;

import ObserverPattern.Observeable.StockObservable;

public class MobileNotificationImp implements NotificationAlertObserver {
	
	private String mobile;
	private StockObservable obj;
	
	public MobileNotificationImp(String mobile,StockObservable obj) {
		// TODO Auto-generated constructor stub
		this.mobile=mobile;
		this.obj=obj;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendNotification(mobile,"Notification send to");
		
	}
	private void sendNotification(String mobile,String msg) {
		System.out.println(msg+": "+mobile);
	}
}
