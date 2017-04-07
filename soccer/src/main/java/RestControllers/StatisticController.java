/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestControllers;

import Repositories.StatisticRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import org.springframework.web.bind.annotation.RestController;
import pkgModel.Match;
import pkgModel.Player;
import pkgModel.Statistic;
import pkgModel.keys.StatisticKey;

/**
 *
 * @author schueler
 */
@RestController
@RequestMapping(value="/statistic")
public class StatisticController {
    
    @Autowired
    StatisticRepository statisticRepository;
    
    @RequestMapping(value = "/get", method=GET)
    public Statistic getStatisticOfPlayerOfMatch(@RequestBody Player paramPlayer,
                                                    @RequestBody Match paramMatch){
        return statisticRepository.findOne(new StatisticKey(paramPlayer, paramMatch));
    }
    
    @RequestMapping(value = "/all", method=GET)
    public Collection<Statistic> getAllStatistics(){
        return statisticRepository.findAll();
    }
    
    @RequestMapping(value = "/getByPlayer", method=GET)
    public Collection<Statistic> getAllStatisticsOfPlayer(@RequestBody Player paramPlayer){
        return statisticRepository.findByIdPlayerId(paramPlayer.getIdPlayer());
    }
    
    @RequestMapping(value = "/add", method=POST)
    public void addStatistic(@RequestBody Statistic paramStatistic){
        statisticRepository.save(paramStatistic);
    }
    
    @RequestMapping(value = "/update", method=PUT)
    public void updateStatistic(@RequestBody Statistic paramStatistic){
        statisticRepository.save(paramStatistic);
    }
    
    @RequestMapping(value = "/delete", method=DELETE)
    public void deleteStatistic(@RequestBody Statistic paramStatistic){
        statisticRepository.delete(paramStatistic);
    }
}
