/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mac.abstractrepository.budgetrepo;

import com.mac.abstractrepository.AbstractRepository;
import com.mac.budgetentities.pojos.User;
//import com.mac.budgetsocket.pojos.User;
import org.springframework.stereotype.Component;

/**
 *
 * @author Mac
 */
@Component
public class UserDao extends AbstractRepository<User>{

    public UserDao() {
        super(User.class);
    }
    
}
