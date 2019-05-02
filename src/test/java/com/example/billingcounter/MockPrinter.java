package com.example.billingcounter;

public class MockPrinter extends Printer{
    private String lastPrintedItem;

    @Override
    public void print(String input) {
        lastPrintedItem = input;
    }

    public String getLastPrintedItem(){
        return lastPrintedItem;
    }
}
