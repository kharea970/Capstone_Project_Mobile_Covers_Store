package com.example.mobile_covers_backend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// this is not a document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    protected String mobileId;
    private String title;
    protected int quantity;
}
