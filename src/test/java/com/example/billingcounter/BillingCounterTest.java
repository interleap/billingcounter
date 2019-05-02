package com.example.billingcounter;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class BillingCounterTest {

    @Test
    public void shouldPrintOrderInvoice(){
        Order order = new StubOrder("stub value");
        MockPrinter printer = new MockPrinter();
        BillingCounter billingCounter = new BillingCounter(printer);
        billingCounter.bill(order);
        assertEquals("stub value", printer.getLastPrintedItem());
    }
}
