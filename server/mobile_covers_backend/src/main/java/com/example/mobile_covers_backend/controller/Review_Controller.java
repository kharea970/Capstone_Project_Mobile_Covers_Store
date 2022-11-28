package com.example.mobile_covers_backend.controller;

import com.example.mobile_covers_backend.models.Review;
import com.example.mobile_covers_backend.repository.Review_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Review_Controller {
    @Autowired
    Review_Repo review_repo;
    @GetMapping("/listallreviews")
    public List<Review> getallreviews(){
        return review_repo.findAll();
    }
    @PostMapping("/createreview")
    public Review createreview(@RequestBody Review review){
        return review_repo.save(review);
    }
    @GetMapping("/getreviewsbymobileid/{mobileid}")
    public List<Review> getreviewbymobileid(@PathVariable String mobileid){
        return review_repo.findbymobileid(mobileid);
    }
}
