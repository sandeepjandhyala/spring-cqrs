/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.command;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import static org.axonframework.commandhandling.model.AggregateLifecycle.apply;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.util.Assert;

/**
 *
 * @author jan_s
 */

@Aggregate
public class Complaint  {
    
    @AggregateIdentifier
    private String id;
    
    private Complaint(){
        
    }

    public Complaint(String complaintId, String companyName, String description ) {
        apply(new ComplaintFiledEvent(complaintId, companyName, description));
    }
    
    @EventSourcingHandler
    public void on(ComplaintFiledEvent e)
    {
        this.id=e.getId();
    }
    
    
}
