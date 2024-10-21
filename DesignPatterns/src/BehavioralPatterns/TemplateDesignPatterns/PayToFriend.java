package BehavioralPatterns.TemplateDesignPatterns;

public class PayToFriend extends PaymentFlow{

    @Override
    public void validateRequest() {
        //specific validation for PayToFriend Flow
        System.out.println("Validate logic of PayToFriend");
    }

    @Override
    public void debitAmount(){
        //debit amount
        System.out.println("Debit amount logic of PayToFriend");
    }

    @Override
    public void calculateFees(){
        //specific Fee computation logic for PayToFriend Flow
        System.out.println("0% fees charged");
    }

    public void creditAmount(){
        //Credit the amount logic
        System.out.println("Credit full amount of PayToFriend");
    }
}
