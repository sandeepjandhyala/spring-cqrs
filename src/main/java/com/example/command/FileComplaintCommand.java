/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.command;

import org.springframework.stereotype.Component;

/**
 *
 * @author jan_s
 */

public class FileComplaintCommand {
    
    private final String id;
    private final String name;
    private final String description;

    public FileComplaintCommand(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
   
    
    
    
}
