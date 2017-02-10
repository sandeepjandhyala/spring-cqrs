/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.query;

import com.example.command.ComplaintFiledEvent;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author jan_s
 */
@Component
public class ComplaintQueryObjectUpdater {
    
    @Autowired
    public ComplaintQueryObjectRepository repo;
    
    @EventHandler
    public void update(ComplaintFiledEvent e){
        
        System.out.println(" complaint event handler " +e.getId());
        repo.save(new ComplaintQueryObject(e.getId(),e.getDescription(),e.getName()));
    }
    
}
