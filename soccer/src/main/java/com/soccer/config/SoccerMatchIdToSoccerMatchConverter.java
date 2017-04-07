/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soccer.config;

import com.soccer.model.SoccerMatch;
import com.soccer.repositores.MatchRepository;
import org.springframework.core.convert.converter.Converter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author schueler
 */
public class SoccerMatchIdToSoccerMatchConverter implements Converter<Integer, SoccerMatch>{
    @Autowired
    private MatchRepository matchRepository;

    public SoccerMatchIdToSoccerMatchConverter() {}

    @Override
    public SoccerMatch convert(Integer s) {
        return matchRepository.findOne(s);
    }
}
