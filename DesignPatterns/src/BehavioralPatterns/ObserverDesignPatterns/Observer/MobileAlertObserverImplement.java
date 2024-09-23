package BehavioralPatterns.ObserverDesignPatterns.Observer;

import BehavioralPatterns.ObserverDesignPatterns.Observable.StocksObservable;

public class MobileAlertObserverImplement implements NotificationAlertObserver{


    String userName;
    StocksObservable observable;

    public MobileAlertObserverImplement(String userName, StocksObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName,"Product is in stock Hurry up");
    }

    private void sendMsgOnMobile(String userName, String msg){
        System.out.println("Msg sent to:" + userName);
        //sent the actual email to the end user
    }
}
