/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mac.abstractrepository.entities.holdem;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Mac
 */
@Entity
@Table(name = "game_setting", catalog = "entity", schema = "holdem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GameSetting_1.findAll", query = "SELECT g FROM GameSetting_1 g"),
    @NamedQuery(name = "GameSetting_1.findByGameid", query = "SELECT g FROM GameSetting_1 g WHERE g.gameid = :gameid"),
    @NamedQuery(name = "GameSetting_1.findByIslimit", query = "SELECT g FROM GameSetting_1 g WHERE g.islimit = :islimit"),
    @NamedQuery(name = "GameSetting_1.findByAnte", query = "SELECT g FROM GameSetting_1 g WHERE g.ante = :ante"),
    @NamedQuery(name = "GameSetting_1.findByIncreaseInterval", query = "SELECT g FROM GameSetting_1 g WHERE g.increaseInterval = :increaseInterval"),
    @NamedQuery(name = "GameSetting_1.findByMaxPlayer", query = "SELECT g FROM GameSetting_1 g WHERE g.maxPlayer = :maxPlayer")})
public class GameSetting implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "gameid", nullable = false, length = 32)
    private String gameid;
    @Basic(optional = false)
    @Column(name = "islimit", nullable = false)
    private boolean islimit;
    @Column(name = "ante")
    private Integer ante;
    @Column(name = "increase_interval")
    private Integer increaseInterval;
    @Column(name = "max_player")
    private Integer maxPlayer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "settingId")
    private List<Contestant> contestantList;

    public GameSetting() {
    }

    public GameSetting(String gameid) {
        this.gameid = gameid;
    }

    public GameSetting(String gameid, boolean islimit) {
        this.gameid = gameid;
        this.islimit = islimit;
    }

    public String getGameid() {
        return gameid;
    }

    public void setGameid(String gameid) {
        this.gameid = gameid;
    }

    public boolean getIslimit() {
        return islimit;
    }

    public void setIslimit(boolean islimit) {
        this.islimit = islimit;
    }

    public Integer getAnte() {
        return ante;
    }

    public void setAnte(Integer ante) {
        this.ante = ante;
    }

    public Integer getIncreaseInterval() {
        return increaseInterval;
    }

    public void setIncreaseInterval(Integer increaseInterval) {
        this.increaseInterval = increaseInterval;
    }

    public Integer getMaxPlayer() {
        return maxPlayer;
    }

    public void setMaxPlayer(Integer maxPlayer) {
        this.maxPlayer = maxPlayer;
    }

    @XmlTransient
    public List<Contestant> getContestantList() {
        return contestantList;
    }

    public void setContestantList(List<Contestant> contestantList) {
        this.contestantList = contestantList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gameid != null ? gameid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GameSetting)) {
            return false;
        }
        GameSetting other = (GameSetting) object;
        if ((this.gameid == null && other.gameid != null) || (this.gameid != null && !this.gameid.equals(other.gameid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mac.abstractrepository.entities.holdem.GameSetting_1[ gameid=" + gameid + " ]";
    }
    
}
