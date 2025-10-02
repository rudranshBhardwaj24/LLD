package oops;

public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.addPaymentMethod("Rudransh Bhardwaj", new DebitCard("1234", "Rudransh Bhardwaj"));
        paymentService.makePayment("Rudransh Bhardwaj");
    }
}
