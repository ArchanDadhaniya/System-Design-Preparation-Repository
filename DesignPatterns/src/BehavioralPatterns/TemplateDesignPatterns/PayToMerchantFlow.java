package BehavioralPatterns.TemplateDesignPatterns;

public class PayToMerchantFlow extends PaymentFlow{

    @Override
    public void validateRequest() {
        //specific validation for PayToFriend Flow
        System.out.println("Validate logic of PayToMerchantFlow");
    }

    @Override
    public void debitAmount(){
        //debit amount
        System.out.println("Debit amount logic of PayToMerchantFlow");
    }

    @Override
    public void calculateFees(){
        //specific Fee computation logic for PayToFriend Flow
        System.out.println("2% fees charged");
    }

    public void creditAmount(){
        //Credit the amount logic
        System.out.println("Credit remaining amount of PayToMerchantFlow");
    }
}


