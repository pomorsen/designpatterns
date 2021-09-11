package designpatterns.creational.simplefactory.ex1_payment_method;

import designpatterns.creational.simplefactory.ex1_payment_method.factory.PaymentFactory;
import designpatterns.creational.simplefactory.ex1_payment_method.payment.Payment;

public class PaymentProcessor {

    private PaymentFactory paymentFactory;

    public PaymentProcessor(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    public void doAction(String paymentType){
        Payment payment = paymentFactory.valueOf(paymentType);
        payment.getStatus();
        payment.transfer();
    }

}
