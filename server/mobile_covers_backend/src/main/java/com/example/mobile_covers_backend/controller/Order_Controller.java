package com.example.mobile_covers_backend.controller;

import com.example.mobile_covers_backend.models.Order;
import com.example.mobile_covers_backend.repository.Order_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Order_Controller {
    @Autowired
    Order_Repo order_repo;

    @GetMapping("/getallorders")
    public List<Order> getAllOrders(){
        return  order_repo.findAll();
    }


    @GetMapping("/getordersbyuserid/{id}")
    public List<Order> getOrderByUserId(@PathVariable String id){
        System.out.println(id);
        return order_repo.findByUserId(id);
    }

    @PostMapping("/createorder")
    public Order createOrder(@RequestBody Order order){
        return order_repo.save(order);
    }
}
