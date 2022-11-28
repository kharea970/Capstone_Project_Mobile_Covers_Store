package com.example.mobile_covers_backend.controller;

import com.example.mobile_covers_backend.models.Mobile;
import com.example.mobile_covers_backend.repository.Mobile_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Mobile_Controller {
    @Autowired
    Mobile_Repo mobile_repo;

    @GetMapping("/listallmobilecovers")
    public List<Mobile> getallmobilecovers(){
        return  mobile_repo.findAll();
    }

    @GetMapping("/allcoversbycategory/{category}")
    public List<Mobile> getCoversByCategory(@PathVariable String category){
        return mobile_repo.findByCategory(category);
    }

    @PostMapping("/createmobile")
    public Mobile createMobile(@RequestBody Mobile mobile){
        return mobile_repo.save(mobile);
    }
}
