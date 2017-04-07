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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
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
@RequestMapping(value="/player")
public class PlayerController {
    
    @Autowired
    PlayerRepository playerRepository;
    
    @RequestMapping(value = "/check", method=GET)
    public boolean checkPlayer(@RequestBody Player paramPlayer){
        return playerRepository.exists(paramPlayer);
    }
    
    @RequestMapping(value = "/all",method=GET)
    public Collection<Player> getAllPlayers(){
        List <Player> players = new ArrayList(playerRepository.findAll());
        return null;
    }
    
    @RequestMapping(value = "/add",method=POST)
    public void addPlayer(@RequestBody Player paramPlayer){
        playerRepository.save(paramPlayer);
    }
    
    @RequestMapping(value = "/update",method=PUT)
    public void updatePlayer(@RequestBody Player paramPlayer){
        playerRepository.save(paramPlayer);
    }
    
    @RequestMapping(value = "/delete",method=DELETE)
    public void deletePlayer(@RequestBody Player paramPlayer){
        try{
            playerRepository.delete(paramPlayer);
        }
        catch(Exception ex){
            paramPlayer.setIsActive(false);
            playerRepository.save(paramPlayer);
        }
    }
}
