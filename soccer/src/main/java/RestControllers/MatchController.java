/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestControllers;

import Repositories.MatchRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import org.springframework.web.bind.annotation.RestController;
import pkgModel.Match;

/**
 *
 * @author schueler
 */
@RestController
@RequestMapping(value="match")
public class MatchController {
    
    @Autowired
    MatchRepository matchRepository;
    
    @RequestMapping(method=GET)
    public Collection<Match> getAllMatches(){
        return null;
    }
    
    @RequestMapping(method=POST)
    public void addMatch(){
    }
    
    @RequestMapping(method=PUT)
    public void updateMatch(){
        
    }
    
    @RequestMapping(method=PUT)
    public void deleteMatch(){
        
    }
}
