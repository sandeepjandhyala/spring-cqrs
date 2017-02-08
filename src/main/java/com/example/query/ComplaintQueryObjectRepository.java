/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jan_s
 */
@Repository
public interface ComplaintQueryObjectRepository extends JpaRepository<ComplaintQueryObject,String> {
    
}
