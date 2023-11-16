package se.lu.ics.models;

public class Customer {
    private String id;
    private String name;
    private CreditCard creditCard;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() { 
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer (String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

}
