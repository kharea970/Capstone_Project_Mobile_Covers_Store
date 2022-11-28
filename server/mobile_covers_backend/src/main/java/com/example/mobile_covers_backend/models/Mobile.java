package com.example.mobile_covers_backend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "mobiles")
public class Mobile {
    @Id
    @Field("_id")
    private String id;
    private String title;
    private String image;
    private int price;
    private String category;
}
