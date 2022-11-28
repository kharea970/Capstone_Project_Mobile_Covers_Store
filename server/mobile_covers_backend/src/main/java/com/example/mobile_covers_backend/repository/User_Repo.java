package com.example.mobile_covers_backend.repository;

import com.example.mobile_covers_backend.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface User_Repo extends MongoRepository<User,String> {
    @Query("{ 'user_email' : ?0 }")
    User getByUser_email(String email);
    @Query("{'user_id':?0}")
    User getbyuserid(String id);
}
