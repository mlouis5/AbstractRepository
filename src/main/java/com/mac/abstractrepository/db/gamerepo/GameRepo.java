/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mac.abstractrepository.db.gamerepo;

import com.mac.abstractrepository.db.base.AbstractRepository;
import com.mac.abstractrepository.entities.holdem.GameSetting;

/**
 *
 * @author Mac
 */
public class GameRepo extends AbstractRepository<GameSetting>{

    public GameRepo() {
        super(GameSetting.class);
    }
    
}
