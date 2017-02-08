/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.command;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

/**
 *
 * @author jan_s
 */
public class FileComplaintCommand {
    
    private String Id;
    private String name;
    private String description;

    public FileComplaintCommand(String Id, String name, String description) {
        this.Id = Id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
   
    
    
    
}
