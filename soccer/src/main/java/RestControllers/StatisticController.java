/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestControllers;

import Repositories.StatisticRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import org.springframework.web.bind.annotation.RestController;
import pkgModel.Statistic;

/**
 *
 * @author schueler
 */
@RestController
@RequestMapping(value="statistic")
public class StatisticController {
    
    @Autowired
    StatisticRepository statisticRepository;
    
    @RequestMapping(method=GET)
    public Statistic getStatisticOfPlayerOfMatch(){
        return null;
    }
    
    @RequestMapping(method=GET)
    public Collection<Statistic> getAllStatistics(){
        return null;
    }
    
    @RequestMapping(method=GET)
    public Collection<Statistic> getAllStatisticsOfYearOfPlayer(){
        return null;
    }
    
    @RequestMapping(method=POST)
    public void addStatistic(){
    }
    
    @RequestMapping(method=PUT)
    public void updateStatistic(){
        
    }
    
    @RequestMapping(method=PUT)
    public void deleteStatistic(){
        
    }
}
