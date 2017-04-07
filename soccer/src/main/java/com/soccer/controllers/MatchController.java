/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soccer.controllers;

import com.soccer.repositores.MatchRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import org.springframework.web.bind.annotation.RestController;
import com.soccer.model.SoccerMatch;
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;

/**
 *
 * @author schueler
 */
@RestController
@RequestMapping(value="/matchs")
public class MatchController {
    
    @Autowired
    MatchRepository matchRepository;
    
    @RequestMapping(method=GET)
    public ResponseEntity<?> getAllMatches(){
        return new ResponseEntity<>(matchRepository.findAll(), HttpStatus.OK);
    }
    
    @RequestMapping(method=POST)
    public ResponseEntity<?> addMatch(@RequestBody SoccerMatch paramMatch){
        ResponseEntity r;
        
        try{
            if(matchRepository.exists(paramMatch.getId()))
                throw new Exception("Match already exists!");
            matchRepository.save(paramMatch);
            r = new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception ex){
            r = new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST); 
        }
        
        return r;        
    }
    
    @RequestMapping(method=PUT)
    public ResponseEntity<?> updateMatch(@RequestBody SoccerMatch paramMatch){
        ResponseEntity r;
        
        try{
            if(!matchRepository.exists(paramMatch.getId()))
                throw new Exception("Match doesn't exist!");
            matchRepository.save(paramMatch);
            r = new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception ex){
            r = new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST); 
        }
        
        return r;  
    }
    
    @RequestMapping(value="/{idMatch}", method=DELETE)
    public ResponseEntity<?> deleteMatch(@RequestBody int idMatch){
        ResponseEntity r;
        
        try{
            SoccerMatch m = matchRepository.findOne(idMatch);
            if(m == null)
                throw new Exception("Match with given Date doesn't exist!");
            
            matchRepository.delete(m);
            r = new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception ex){
            r = new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST); 
        }
        
        return r; 
    }
}
