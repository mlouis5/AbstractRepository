/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mac.abstractrepository.entities.holdem;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mac
 */
@Entity
@Table(name = "contestant", catalog = "entity", schema = "holdem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contestant.findAll", query = "SELECT c FROM Contestant c"),
    @NamedQuery(name = "Contestant.findByEmail", query = "SELECT c FROM Contestant c WHERE c.email = :email"),
    @NamedQuery(name = "Contestant.findByFName", query = "SELECT c FROM Contestant c WHERE c.fName = :fName"),
    @NamedQuery(name = "Contestant.findByLName", query = "SELECT c FROM Contestant c WHERE c.lName = :lName")})
public class Contestant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "email", nullable = false, length = 128)
    private String email;
    @Basic(optional = false)
    @Column(name = "f_name", nullable = false, length = 128)
    private String fName;
    @Basic(optional = false)
    @Column(name = "l_name", nullable = false, length = 128)
    private String lName;
    @JoinColumn(name = "setting_id", referencedColumnName = "gameid", nullable = false)
    @ManyToOne(optional = false)
    private GameSetting settingId;

    public Contestant() {
    }

    public Contestant(String email) {
        this.email = email;
    }

    public Contestant(String email, String fName, String lName) {
        this.email = email;
        this.fName = fName;
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public GameSetting getSettingId() {
        return settingId;
    }

    public void setSettingId(GameSetting settingId) {
        this.settingId = settingId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (email != null ? email.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contestant)) {
            return false;
        }
        Contestant other = (Contestant) object;
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mac.abstractrepository.entities.holdem.Contestant[ email=" + email + " ]";
    }
    
}
