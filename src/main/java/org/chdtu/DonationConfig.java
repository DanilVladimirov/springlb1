package org.chdtu;

public class DonationConfig {
    private String name;
    private Float sumFrom;
    private String textColor;
    private final User user;

    public DonationConfig(User user) {
        this.user = user;
        System.out.println("DonationConfig bean is created");
    }

    public User getUser() {
        return this.user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSumFrom() {
        return sumFrom;
    }

    public void setSumFrom(Float sumFrom) {
        this.sumFrom = sumFrom;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

}
