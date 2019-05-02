package com.example.billingcounter;

import java.util.List;
import java.util.stream.Collectors;

public class Order {
    private String orderId;
    private List<Item> items;

    @Override
    public String toString() {
        return "Order Id: " + orderId + "\n" +
                "Items\n" +
                items.stream().map(Item::toString).collect(Collectors.joining("\n"));
    }
}
