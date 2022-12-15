package com.example.mobile_covers_backend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor

@Document(collection = "user")
public class User {
    @Id
    private String user_id;
    @Field("name")
    private String user_name;
    @Indexed(unique = true)
    @Field("email")
    private String user_email;
    @Field("password")
    private String user_password;

    private List<Address> address_list;
    private List<PaymentMethod> payment_list;

    private int main_address;
    private int main_payment;
    public User(){
        this.address_list = new ArrayList<>();
        this.payment_list = new ArrayList<>();
        this.main_payment = 0;
        this.main_address = 0;

    }
}

