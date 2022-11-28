package com.example.mobile_covers_backend.repository;

import com.example.mobile_covers_backend.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Order_Repo extends MongoRepository<Order,String> {
    @Query("{ 'userId' : ?0 }")
    List<Order> findByUserId(String userId);
}
