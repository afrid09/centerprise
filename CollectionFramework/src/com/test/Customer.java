package com.test;

import java.util.Objects;

public class Customer implements Comparable<Customer> {

    public Customer() {
        super();
    }

    private Integer customerId;
    private String customerName;
    private String email;
    private Double purchaseAmount;

    @Override
    public int compareTo(Customer o) {
        if (this.getCustomerId().compareTo(o.getCustomerId()) == 0)
            return 0;
        else if (this.getCustomerId().compareTo(o.getCustomerId()) > 0)
            return 1;
        else
            return -1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        return Objects.equals(customerId, other.customerId);
    }

    public Customer(Integer customerId, String customerName, String email, Double purchaseAmount) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.purchaseAmount = purchaseAmount;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(Double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", email=" + email
                + ", purchaseAmount=" + purchaseAmount + "]";
    }
}
