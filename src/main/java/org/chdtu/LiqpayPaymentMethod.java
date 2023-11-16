package org.chdtu;


public class LiqpayPaymentMethod implements PaymentMethod {
    private Float tax;

    public LiqpayPaymentMethod() {
        System.out.println("LiqpayPaymentMethod bean is created");
    }

    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }

    public void makePayment(float sum) {
        System.out.println(
                String.format("[LiqpayPaymentMethod] Створили оплату на суму %f", sum)
        );
    }
}
