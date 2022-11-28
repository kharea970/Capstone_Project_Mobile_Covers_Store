package com.example.mobile_covers_backend.repository;

import com.example.mobile_covers_backend.models.Mobile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Mobile_Repo extends MongoRepository<Mobile,String> {
    @Query("{ 'category' : ?0 }")
    List<Mobile> findByCategory(String category);
}
