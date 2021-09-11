package designpatterns.creational.simplefactory.ex1_payment_method.payment;

public class PayPalPayment implements Payment {
    @Override
    public void transfer() {
        System.out.println("PayPal transfer");
    }

    @Override
    public void getStatus() {
        System.out.println("PayPayl status");
    }
}
