/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mac.abstractrepository.db.common;

import com.mac.abstractrepository.entities.budget.Address;

/**
 *
 * @author Mac
 */
public interface Addressable {
    void setAddress(Address address);
    
    Address getAddress();
}
