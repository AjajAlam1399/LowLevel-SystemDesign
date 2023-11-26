package ObserverPattern.Observeable;

import ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
	public void add(NotificationAlertObserver obj);
	public void remove(NotificationAlertObserver obj);
	public void Notify();
	public void setStock(int stock);
	public int getStock();
}
