package se.lu.ics.models;

public class CreditCard {
    private String number;
    private String type;
    private Customer holder;

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreditCard(String number, String type) {
        this.number = number;
        this.type = type;
    }

    public void setHolder(Customer holder) {
        this.holder = holder;
    }

    public Customer getHolder() {
        return holder;
    }
    
}
