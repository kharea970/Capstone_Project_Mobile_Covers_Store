package com.example.mobile_covers_backend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "user")
public class User {
    @Id
    private String user_id;
    @Field("name")
    private String user_name;
    @Field("email")
    private String user_email;
    @Field("password")
    private String user_password;

    private List<Address> address_list;
    private List<PaymentMethod> payment_list;

    private int main_address;
    private int main_payment;
}
