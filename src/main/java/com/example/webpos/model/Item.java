package com.example.webpos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
@RequiredArgsConstructor
public class Item {
    private String id = UUID.randomUUID().toString();

    @NonNull
    private Product product;
    @NonNull
    private int quantity;

    @Override
    public String toString() {
        return product.toString() + "\t" + quantity;
    }
}
