/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soccer.repositores;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.soccer.model.Player;

/**
 *
 * @author schueler
 */
public interface PlayerRepository extends JpaRepository<Player, Integer>{
    
}
