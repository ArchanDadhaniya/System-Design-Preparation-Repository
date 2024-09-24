package BehavioralPatterns.ObserverDesignPatterns;

import BehavioralPatterns.ObserverDesignPatterns.Observable.IphoneObservableImplement;
import BehavioralPatterns.ObserverDesignPatterns.Observable.StocksObservable;
import BehavioralPatterns.ObserverDesignPatterns.Observer.EmailAlertObserverImplement;
import BehavioralPatterns.ObserverDesignPatterns.Observer.MobileAlertObserverImplement;
import BehavioralPatterns.ObserverDesignPatterns.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneObservableImplement();

        NotificationAlertObserver observer1 = new EmailAlertObserverImplement("xyz1@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImplement("xyz2@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImplement("xyz_username",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}



/*
Intent:-
        Define a one to many dependency between objects so that when one object changes state, all its dependents
        are notified and updated automatically.
 */