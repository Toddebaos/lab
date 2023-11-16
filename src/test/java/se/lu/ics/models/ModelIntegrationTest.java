package se.lu.ics.models;

public class ModelIntegrationTest {

    public static void main(String[] args) {
        CustomerRegister register = new CustomerRegister();

        Customer customer1 = new Customer("C1", "Bob Jones");
        Customer customer2 = new Customer("C2", "Ham Smith");

        register.addCustomer(customer1);
        register.addCustomer(customer2);

        CreditCard card1 = new CreditCard("28934832493283", "Amex");
        CreditCard card2 = new CreditCard("12345678901234", "Mastercard");

        customer1.setCreditCard(card1);
        card1.setHolder(customer1);

        register.setCustomerCreditCard("C2", card2);

        System.out.println("All customer names:");
        for (Customer customer : register.getCustomers()) {
            System.out.println(customer.getName());
        }

        System.out.println();

        System.out.println("Customer 1's credit card number:");
        System.out.println(customer1.getCreditCard().getNumber());
        System.out.println();

        System.out.println("Customer 2's credit card type:");
        System.out.println(customer2.getCreditCard().getType());
        System.out.println();

        System.out.println("Card 1's holder:");
        System.out.println(card1.getHolder().getName());
        System.out.println();

        System.out.println("Find Customer 1:");
        System.out.println(register.findCustomer("C1").getName());
        System.out.println();

        register.setCustomerName("C1", "Sam Johnson");

        System.out.println("Find Customer 1 with new name:");
        System.out.println(register.findCustomer("C1").getName());

    }

}
