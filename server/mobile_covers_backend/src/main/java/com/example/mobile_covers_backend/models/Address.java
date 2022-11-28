package com.example.mobile_covers_backend.models;

import lombok.*;

/** Not a document */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {

    private String firstname;
    private String lastname;
    private String address;
    private String address2;
    private String country;
    private String state;
    private String zip;

}
