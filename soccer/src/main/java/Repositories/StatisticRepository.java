/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import pkgModel.Statistic;
import pkgModel.keys.StatisticKey;

/**
 *
 * @author schueler
 */
public interface StatisticRepository extends JpaRepository<Statistic, StatisticKey> {
    List<Statistic> findByIdPlayerId(int id);
}
