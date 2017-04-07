/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soccer.controllers;

import com.soccer.repositores.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import org.springframework.web.bind.annotation.RestController;
import com.soccer.model.Player;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author schueler
 */
@RestController
@RequestMapping(value="/players")
public class PlayerController {
    
    @Autowired
    PlayerRepository playerRepository;
    
    @RequestMapping(value = "/check/{idPlayer}", method=GET)
    public ResponseEntity<?> checkPlayer(@PathVariable int idPlayer){
        return new ResponseEntity<>(playerRepository.exists(idPlayer), HttpStatus.OK);
    }
    
    @RequestMapping(method=GET)
    public ResponseEntity<?> getAllPlayers(){
        return new ResponseEntity<>(playerRepository.findAll(), HttpStatus.OK);
    }
    
    @RequestMapping(method=POST)
    public ResponseEntity<?> addPlayer(@RequestBody Player paramPlayer){
        ResponseEntity r;
        
        try{
            if(playerRepository.exists(paramPlayer.getIdPlayer()))
                throw new Exception("Player already exists!");
            playerRepository.save(paramPlayer);
            r = new ResponseEntity(HttpStatus.OK);
        }
        catch(Exception ex){
            r = new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
        
        return r;
    }
    
    @RequestMapping(method=PUT)
    public ResponseEntity<?> updatePlayer(@RequestBody Player paramPlayer){
        ResponseEntity r;
        
        try{
            if(!playerRepository.exists(paramPlayer.getIdPlayer()))
                throw new Exception("Player doesn't exist!");
            playerRepository.save(paramPlayer);
            r = new ResponseEntity(HttpStatus.OK);
        }
        catch(Exception ex){
            r = new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
        
        return r;
    }
    
    @RequestMapping(value="/{idPlayer}", method=DELETE)
    public ResponseEntity<?> deletePlayer(@PathVariable int idPlayer){
        ResponseEntity r;
        Player p = playerRepository.findOne(idPlayer);
        
        try{
            if(p == null)
                throw new Exception("Player with given ID doesn't exist!");
            playerRepository.delete(p);
            r = new ResponseEntity("Player could be deleted", HttpStatus.OK);
        }
        catch(Exception ex){
            if(p != null)
            {
                try{
                    p.setIsActive(false);
                    playerRepository.save(p);
                    r = new ResponseEntity("Player was set inactive", HttpStatus.OK);
                }
                catch(Exception exInner){
                    r = new ResponseEntity(exInner.getMessage(),HttpStatus.BAD_REQUEST);
                }
            }
            else
            {
                r = new ResponseEntity(ex.getMessage(),HttpStatus.BAD_REQUEST); 
            }
        }
        
        return r;
    }
}
