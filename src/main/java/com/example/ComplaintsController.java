/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.query.ComplaintQueryObject;
import com.example.command.FileComplaintCommand;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.query.ComplaintQueryObjectRepository;

/**
 *
 * @author jan_s
 */
@RestController
public class ComplaintsController {
    
 
   private final ComplaintQueryObjectRepository queryRepository;
    
    private final CommandGateway commandGateway;

    @Autowired
    public ComplaintsController(ComplaintQueryObjectRepository queryRepository, CommandGateway commandGateway) {
        this.queryRepository = queryRepository;
        this.commandGateway = commandGateway;
    }
    
    @GetMapping()
    public List<ComplaintQueryObject> getAllComplaints()
    {
        return queryRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ComplaintQueryObject getComplaint(@PathVariable String Id)
    {
        return queryRepository.findOne(Id);
    }
    
    @PostMapping
    public CompletableFuture<String> fileComplaint(@RequestBody Map<String,String> request)
    {
        String id = UUID.randomUUID().toString();
        System.out.println("file complaint command about to be fired " +id);
        return commandGateway.send(new FileComplaintCommand(id, request.get("company") , request.get("description")));
    }
}
