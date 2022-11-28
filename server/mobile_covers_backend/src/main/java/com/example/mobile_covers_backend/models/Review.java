package com.example.mobile_covers_backend.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "review")
@CompoundIndexes({
        @CompoundIndex(name = "mobile_user",
                def = "{'mobileId' : 1, 'userId': 1}",
                unique = true)
})
public class Review {
    @Id
    @Field("_id")
    private String id;
    private String name;
    private String mobileId;
    private String userId;
    private int rating;
    private String text;
}
