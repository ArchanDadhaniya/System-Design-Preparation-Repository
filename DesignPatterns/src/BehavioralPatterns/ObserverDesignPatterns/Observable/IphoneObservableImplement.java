package BehavioralPatterns.ObserverDesignPatterns.Observable;

import BehavioralPatterns.ObserverDesignPatterns.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImplement implements StocksObservable{

    public List<NotificationAlertObserver> observersList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observersList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observersList.remove(observer);
    }


    @Override
    public void notifySubscriber() {
        for (NotificationAlertObserver observer : observersList) {
            observer.update();
        }
    }

    public void setStockCount(int newStockAdded){
        if(stockCount == 0){
            notifySubscriber();
        }
        stockCount = stockCount + newStockAdded;
    }

    public int getStockCount() {
        return stockCount;
    }
}
