/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soccer.config;

import com.soccer.model.Player;
import com.soccer.model.SoccerMatch;
import com.soccer.repositores.MatchRepository;
import com.soccer.repositores.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

/**
 *
 * @author schueler
 */
public class PlayerIdToPlayerConverter implements Converter<Integer, Player>{
    @Autowired
    private PlayerRepository playerRepository;

    public PlayerIdToPlayerConverter() {}

    @Override
    public Player convert(Integer s) {
        return playerRepository.findOne(s);
    }
}
