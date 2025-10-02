package oops;

public class CreditCard extends Card implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Payment Made Via Credit Card");
    }

    public CreditCard(String cardNumber, String cardHolderName) {
        super(cardNumber, cardHolderName);
    }
}
