package com.example.mobile_covers_backend.models;

import lombok.*;
//not a document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PaymentMethod {
    private String CardNumber;
    private String name;

}
