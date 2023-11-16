package se.lu.ics.models;

import java.util.ArrayList;

public class CustomerRegister {

    ArrayList <Customer> customers = new ArrayList <Customer>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer findCustomer(String id) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }

    public void removeCustomer(String id) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                customers.remove(customer);
            }
        }
    }

    public Customer setCustomerName(String id, String name) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                customer.setName(name);
                return customer;
            }
        }
        return null;
    }

    public void setCustomerCreditCard(String id, CreditCard creditCard) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                customer.setCreditCard(creditCard);
                creditCard.setHolder(customer);
            }
        }
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    
}
