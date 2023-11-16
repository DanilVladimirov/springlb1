package org.chdtu;

public class MonobankPaymentMethod implements PaymentMethod {
    private Float tax;

    public MonobankPaymentMethod() {
        System.out.println("MonobankPaymentMethod bean is created");
    }

    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }

    public void makePayment(float sum) {
        System.out.println(
                String.format("[MonobankPayment] Створили оплату на суму %f", sum)
        );
    }
}
