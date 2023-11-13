package org.chdtu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "donatesContext.xml"
        );

        Donation donation = context.getBean("firstDonation", Donation.class);

        System.out.println(donation.getText());

        context.close();
    }
}
