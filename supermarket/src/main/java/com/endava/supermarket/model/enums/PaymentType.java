package com.endava.supermarket.model.enums;

public enum PaymentType {
    CASH("Cash"), CARD("Card");
    private final String paymentType;

    PaymentType(String type) {
        this.paymentType = type;
    }

    public String getPaymentType() {
        return paymentType;
    }
}
