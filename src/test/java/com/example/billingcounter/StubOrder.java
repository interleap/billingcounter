package com.example.billingcounter;

public class StubOrder extends Order{


    private String stubToString;

    public StubOrder(String stubToString) {
        super(null, null);
        this.stubToString = stubToString;
    }

    @Override
    public String toString() {
        return stubToString;
    }
}
