package designpatterns.creational.simplefactory.ex1_payment_method.factory;

import designpatterns.creational.simplefactory.ex1_payment_method.payment.BlikPayment;
import designpatterns.creational.simplefactory.ex1_payment_method.payment.PayPalPayment;
import designpatterns.creational.simplefactory.ex1_payment_method.payment.Payment;

public class PaymentFactory {

    public Payment valueOf(String paymentType) {
        Payment payment;
        if (paymentType.equals("blik")) {
            payment = new BlikPayment();
        } else if (paymentType.equals("paypal")) {
            payment = new PayPalPayment();
        } else {
            throw new RuntimeException("Payment type not provided");
        }
        return payment;
    }
}
