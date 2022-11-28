package com.example.mobile_covers_backend.repository;

import com.example.mobile_covers_backend.models.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Review_Repo extends MongoRepository<Review,String> {
    @Query("{ 'mobileId' : ?0 }")
    List<Review> findbymobileid(String mobileid);
}
