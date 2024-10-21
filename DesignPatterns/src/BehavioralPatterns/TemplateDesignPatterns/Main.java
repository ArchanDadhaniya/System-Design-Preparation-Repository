package BehavioralPatterns.TemplateDesignPatterns;

public class Main {
    public static void main(String[] args) {
        System.out.println("PayToFriend Flow:");
        PaymentFlow payToFriend = new PayToFriend();
        payToFriend.sendMoney();

        System.out.println("\nPayToMerchantFlow:");
        PaymentFlow payToMerchant = new PayToMerchantFlow();
        payToMerchant.sendMoney();
    }
}
