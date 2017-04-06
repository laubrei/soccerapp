/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestControllers;

import Repositories.PlayerRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import org.springframework.web.bind.annotation.RestController;
import pkgModel.Player;

/**
 *
 * @author schueler
 */
@RestController
@RequestMapping(value="player")
public class PlayerController {
    
    @Autowired
    PlayerRepository playerRepository;
    
    @RequestMapping(method=GET)
    public Collection<Player> getAllPlayers(){
        List <Player> players = new ArrayList(playerRepository.findAll());
        return null;
    }
    
    @RequestMapping(method=POST)
    public void addPlayer(){
      
    }
    
    @RequestMapping(method=PUT)
    public void updatePlayer(){
        
    }
    
    @RequestMapping(method=PUT)
    public void deletePlayer(){
        
    }
}
