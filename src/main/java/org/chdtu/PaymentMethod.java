package org.chdtu;

public class PaymentMethod {
    private String name;
    private Float tax;

    public PaymentMethod() {
        System.out.println("PaymentMethod bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }
}
