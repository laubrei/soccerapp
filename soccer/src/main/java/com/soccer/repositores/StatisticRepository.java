/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soccer.repositores;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.soccer.model.Statistic;
import com.soccer.model.keys.StatisticKey;

/**
 *
 * @author schueler
 */
public interface StatisticRepository extends JpaRepository<Statistic, StatisticKey> {
    List<Statistic> findByIdPlayerId(int id);
}
