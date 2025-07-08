package com.rafael.backend.model;

import jakarta.persistence.*;

@Entity
public class PaymentInstruction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String solanceFrom;
    private String solanceTo;
    private Double amountSell;
    private Double amountBuy;
    private Double rate;
    private String timePlaced;
    private String beneficiaryIban;
    private String originatingCountry;
    private String paymentRef;
    private String purposeRef;

    @ManyToOne
    private Customer customer;

    public PaymentInstruction() {};

    public PaymentInstruction(Long id, String solanceFrom, String solanceTo, Double amountSell, Double amountBuy, Double rate, String timePlaced, String beneficiaryIban, String originatingCountry, String paymentRef, String purposeRef, Customer customer) {
        this.id = id;
        this.solanceFrom = solanceFrom;
        this.solanceTo = solanceTo;
        this.amountSell = amountSell;
        this.amountBuy = amountBuy;
        this.rate = rate;
        this.timePlaced = timePlaced;
        this.beneficiaryIban = beneficiaryIban;
        this.originatingCountry = originatingCountry;
        this.paymentRef = paymentRef;
        this.purposeRef = purposeRef;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSolanceFrom() {
        return solanceFrom;
    }

    public void setSolanceFrom(String solanceFrom) {
        this.solanceFrom = solanceFrom;
    }

    public String getSolanceTo() {
        return solanceTo;
    }

    public void setSolanceTo(String solanceTo) {
        this.solanceTo = solanceTo;
    }

    public Double getAmountSell() {
        return amountSell;
    }

    public void setAmountSell(Double amountSell) {
        this.amountSell = amountSell;
    }

    public Double getAmountBuy() {
        return amountBuy;
    }

    public void setAmountBuy(Double amountBuy) {
        this.amountBuy = amountBuy;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getTimePlaced() {
        return timePlaced;
    }

    public void setTimePlaced(String timePlaced) {
        this.timePlaced = timePlaced;
    }

    public String getBeneficiaryIban() {
        return beneficiaryIban;
    }

    public void setBeneficiaryIban(String beneficiaryIban) {
        this.beneficiaryIban = beneficiaryIban;
    }

    public String getOriginatingCountry() {
        return originatingCountry;
    }

    public void setOriginatingCountry(String originatingCountry) {
        this.originatingCountry = originatingCountry;
    }

    public String getPaymentRef() {
        return paymentRef;
    }

    public void setPaymentRef(String paymentRef) {
        this.paymentRef = paymentRef;
    }

    public String getPurposeRef() {
        return purposeRef;
    }

    public void setPurposeRef(String purposeRef) {
        this.purposeRef = purposeRef;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
