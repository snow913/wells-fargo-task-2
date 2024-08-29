package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private int securityId;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String Category;

    @Column(nullable = false)
    private Date PurchaseDate;

    @Column(nullable = false)
    private long PurchasePrice;

    @Column(nullable = false)
    private int quantity;

    public Security(int securityId, String name, String category, Date purchaseDate, long purchasePrice, int quantity) {
        this.securityId = securityId;
        Name = name;
        Category = category;
        PurchaseDate = purchaseDate;
        PurchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public Security() {
    }

    public int getSecurityId() {
        return securityId;
    }

    public void setSecurityId(int securityId) {
        this.securityId = securityId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Date getPurchaseDate() {
        return PurchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        PurchaseDate = purchaseDate;
    }

    public long getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchasePrice(long purchasePrice) {
        PurchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
