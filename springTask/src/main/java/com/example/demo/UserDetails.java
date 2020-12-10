package com.example.demo;

import javax.persistence.*;

@Entity
public class UserDetails {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userRoleId")
    private UserRole userRole;

    public UserTeam getUserTeam() {
        return userTeam;
    }

    public void setUserTeam(UserTeam userTeam) {
        this.userTeam = userTeam;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userTeamId")
    private UserTeam userTeam;

    public UserDetails() {
        super();
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public UserDetails(long id, String name, String address, UserRole userRole, UserTeam userTeam) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.userRole = userRole;
        this.userTeam = userTeam;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
