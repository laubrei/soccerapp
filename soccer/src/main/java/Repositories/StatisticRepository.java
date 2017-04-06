/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import pkgModel.Statistic;

/**
 *
 * @author schueler
 */
public interface StatisticRepository extends JpaRepository<Statistic, Serializable> {
    
}
