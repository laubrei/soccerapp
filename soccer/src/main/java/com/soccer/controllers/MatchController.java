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
import com.soccer.model.Match;

/**
 *
 * @author schueler
 */
@RestController
@RequestMapping(value="match")
public class MatchController {
    
    @Autowired
    MatchRepository matchRepository;
    
    @RequestMapping(value = "/all", method=GET)
    public Collection<Match> getAllMatches(){
        return matchRepository.findAll();
    }
    
    @RequestMapping(value = "/add", method=POST)
    public void addMatch(@RequestBody Match paramMatch){
        matchRepository.save(paramMatch);
    }
    
    @RequestMapping(value = "/update", method=PUT)
    public void updateMatch(@RequestBody Match paramMatch){
        matchRepository.save(paramMatch);
    }
    
    @RequestMapping(value = "/delete", method=PUT)
    public void deleteMatch(@RequestBody Match paramMatch){
        matchRepository.delete(paramMatch);
    }
}
