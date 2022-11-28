package com.example.mobile_covers_backend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "order")
public class Order {
    @Id
    @Field("_id")
    private String order_id;
    @Indexed
    private String userId;
    private List<Item> lineItems;
    private Address shippingAddress;
    private PaymentMethod paymentMethod;
    private int subtotal;
    private Date date;
}
