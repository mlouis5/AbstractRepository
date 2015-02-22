/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mac.abstractrepository.budgetrepo;

import com.mac.abstractrepository.AbstractRepository;
import com.mac.budgetentities.pojos.Payment;

/**
 *
 * @author Mac
 */
public class PaymentDao extends AbstractRepository<Payment>{

    public PaymentDao() {
        super(Payment.class);
    }
    
}