package designpatterns.creational.simplefactory.ex1_payment_method.payment;

public class BlikPayment implements Payment {
    @Override
    public void transfer() {
        System.out.println("blik transfer");
    }

    @Override
    public void getStatus() {
        System.out.println("Current blik status");
    }
}
