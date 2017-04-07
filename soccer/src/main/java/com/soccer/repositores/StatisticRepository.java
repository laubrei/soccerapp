/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soccer.repositores;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.soccer.model.Statistic;

/**
 *
 * @author schueler
 */
public interface StatisticRepository extends JpaRepository<Statistic, Integer> {
    List<Statistic> findByFkPlayerId(int id);
    Statistic findByFkPlayerIdAndFkMatchId(int fkPlayer, int fkMatch);
}
