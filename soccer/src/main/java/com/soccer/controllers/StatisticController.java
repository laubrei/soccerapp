/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soccer.controllers;

import com.soccer.repositores.StatisticRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import org.springframework.web.bind.annotation.RestController;
import com.soccer.model.SoccerMatch;
import com.soccer.model.Player;
import com.soccer.model.Statistic;
import com.soccer.model.keys.StatisticKey;
import com.soccer.repositores.MatchRepository;
import com.soccer.repositores.PlayerRepository;
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author schueler
 */
@RestController
@RequestMapping(value="/statistics")
public class StatisticController {
    
    @Autowired
    StatisticRepository statisticRepository;
    
    @Autowired
    PlayerRepository playerRepository;
    
    @Autowired
    MatchRepository matchRepository;
    
    @RequestMapping(value="/{idPlayer}/{idMatch}", method=GET)
    public ResponseEntity<?> getStatisticOfPlayerOfMatch(@PathVariable int idPlayer,
                                                    @PathVariable int idMatch){
        ResponseEntity r;
        
        try{
            Player p = playerRepository.findOne(idPlayer);
            if(p == null)
                throw new Exception("Player with given ID doesn't exist!");
            SoccerMatch m = matchRepository.findOne(idMatch);
            if(m == null)
                throw new Exception("Match with given Date doesn't exist!");

            r = new ResponseEntity(statisticRepository.findOne(new StatisticKey(p, m)), HttpStatus.OK);
        }
        catch(Exception ex){
            r = new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
        
        return r;
    }
    
    @RequestMapping(method=GET)
    public ResponseEntity<?> getAllStatistics(){
        return new ResponseEntity (statisticRepository.findAll(), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/{idPlayer}", method=GET)
    public ResponseEntity<?> getAllStatisticsOfPlayer(@PathVariable int idPlayer){
        //error shouldn't be possible
        return new ResponseEntity(statisticRepository.findByIdPlayerId(idPlayer), HttpStatus.OK);
    }
    
    @RequestMapping(method=POST)
    public ResponseEntity<?> addStatistic(@RequestBody Statistic paramStatistic){
        ResponseEntity r;
        
        try{            
            if(statisticRepository.exists(new StatisticKey(paramStatistic.getIdPlayer(), paramStatistic.getIdMatch())))
                throw new Exception("Statistic already exists!");
            statisticRepository.save(paramStatistic);
            r = new ResponseEntity(HttpStatus.OK);
        }
        catch(Exception ex){
            r = new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
        
        return r;
    }
    
    @RequestMapping(method=PUT)
    public ResponseEntity<?> updateStatistic(@RequestBody Statistic paramStatistic){
        ResponseEntity r;
        
        try{            
            if(!statisticRepository.exists(new StatisticKey(paramStatistic.getIdPlayer(), paramStatistic.getIdMatch())))
                throw new Exception("Statistic doesn't exist!");
            statisticRepository.save(paramStatistic);
            r = new ResponseEntity(HttpStatus.OK);
        }
        catch(Exception ex){
            r = new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
        
        return r;
    }
    
    @RequestMapping(method=DELETE)
    public ResponseEntity<?> deleteStatistic(@RequestBody Statistic paramStatistic){
        ResponseEntity r;
        
        try{            
            if(!statisticRepository.exists(new StatisticKey(paramStatistic.getIdPlayer(), paramStatistic.getIdMatch())))
                throw new Exception("Statistic doesn't exist!");
            statisticRepository.delete(paramStatistic);
            r = new ResponseEntity(HttpStatus.OK);
        }
        catch(Exception ex){
            r = new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
        
        return r;
    }
}
