package model;

public class Card {
    private Long id;
    private String pam;
    private String cvv;
    private String expireDate;
    private Customer customer;
    private boolean isBlocked;

    public Card(Long id, String pam, String cvv, String expireDate, Customer customer, boolean isBlocked) {
        this.id = id;
        this.pam = pam;
        this.cvv = cvv;
        this.expireDate = expireDate;
        this.customer = customer;
        this.isBlocked = isBlocked;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPam() {
        return pam;
    }

    public void setPam(String pam) {
        this.pam = pam;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public Customer getCostumer() {
        return customer;
    }

    public void setCostumer(Customer customer) {
        this.customer = customer;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", pam='" + pam + '\'' +
                ", cvv='" + cvv + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", customer=" + customer +
                ", isBlocked=" + isBlocked +
                '}';
    }
}
