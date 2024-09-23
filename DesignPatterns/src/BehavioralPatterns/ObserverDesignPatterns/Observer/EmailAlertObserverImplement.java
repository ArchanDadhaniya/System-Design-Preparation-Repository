package BehavioralPatterns.ObserverDesignPatterns.Observer;

import BehavioralPatterns.ObserverDesignPatterns.Observable.StocksObservable;

public class EmailAlertObserverImplement implements NotificationAlertObserver{

    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImplement(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "Product is in Stock hurry up!");
    }

    private void sendMail(String emailId, String message) {
        System.out.println("Sending mail to " + emailId);
        //send the actual email to the end user
    }
}
