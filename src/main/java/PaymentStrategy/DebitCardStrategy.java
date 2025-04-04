package PaymentStrategy;

public class DebitCardStrategy implements PaymentStrategy {
    private int debitCardNumber;
    private int expiryDate;

    public DebitCardStrategy(int debitcardnumber, int expirydate) {
        this.debitCardNumber = debitcardnumber;
        this.expiryDate = expirydate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Amount" + amount + "Pay with Debit Card with debit card number " + debitCardNumber);
    }
}
