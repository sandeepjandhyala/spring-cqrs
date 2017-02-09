/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.command;

import org.axonframework.commandhandling.CommandHandler;
import static org.axonframework.commandhandling.model.AggregateLifecycle.apply;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 *
 * @author jan_s
 */
@Component
public class FileComplaintCommandHandler {

    @CommandHandler
    public void handle(FileComplaintCommand c) {

        Assert.hasLength(c.getName());
        new Complaint(c.getId(),c.getName(),c.getDescription());
        

    }

}
