/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mac.abstractrepository.budgetrepo;

import com.mac.abstractrepository.AbstractRepository;
import com.mac.budgetentities.pojos.Address;
//import com.mac.budgetsocket.pojos.Address;
import org.springframework.stereotype.Component;

/**
 *
 * @author Mac
 */
@Component
public class AddressDao extends AbstractRepository<Address>{

    public AddressDao() {
        super(Address.class);
    }
    
}
