package com.example.billingcounter;

public class BillingCounter {
    private Printer printer;

    public BillingCounter(Printer printer) {
        this.printer = printer;
    }

    public void bill(Order order){
        printer.print(order.toString());
    }
}
