package oops;

public class DebitCard extends Card{
    public DebitCard(String cardNumber, String cardHolderName) {
        super(cardNumber,cardHolderName);
    }

    public void pay() {
        System.out.println("Payment made via Debit card");
    }
}
