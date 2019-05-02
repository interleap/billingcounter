package com.example.billingcounter;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class BillingCounterTest {

    @Test
    public void shouldPrintOrderInvoice(){
        Item item1 = new Item("i1", 10);
        Item item2 = new Item("i2", 20);
        Order order = new Order("123", asList(item1, item2));
        MockPrinter printer = new MockPrinter();
        BillingCounter billingCounter = new BillingCounter(printer);
        billingCounter.bill(order);
        assertEquals("Order Id: 123\n" +
                "Items\n" +
                "i1\t\t10.0\n" +
                "i2\t\t20.0", printer.getLastPrintedItem());
    }
}
