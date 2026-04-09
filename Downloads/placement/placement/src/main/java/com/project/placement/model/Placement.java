package com.project.placement.model;

import jakarta.persistence.*;

@Entity
public class Placement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String company;
    private String role;

    // getters
    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public String getRole() {
        return role;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
