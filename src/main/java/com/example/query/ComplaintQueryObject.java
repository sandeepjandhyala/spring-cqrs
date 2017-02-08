/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.query;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author jan_s
 */
@Entity
public class ComplaintQueryObject {
    
    @Id
    public String complaintId;
    public String complaintDesc;
    public String companyName;

    public ComplaintQueryObject(String complaintId, String complaintDesc, String companyName) {
        this.complaintId = complaintId;
        this.complaintDesc = complaintDesc;
        this.companyName = companyName;
    }

    public ComplaintQueryObject() {
    }
    
    

    public String getComplaintId() {
        return complaintId;
    }

    public String getComplaintDesc() {
        return complaintDesc;
    }

    public String getCompanyName() {
        return companyName;
    }
    
    
            
    
}
