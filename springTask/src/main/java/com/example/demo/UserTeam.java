package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserTeam {
    @Id
    @GeneratedValue
    private long id;
    private String teamName;

    public UserTeam() {
        super();
    }

    public UserTeam(long id, String teamName) {
        super();
        this.id = id;
        this.teamName = teamName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
