package com.oussema.Projet_Rest.model;

import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id_category;
    private String lib;

    public Category(int id_category, String lib) {
        this.id_category = id_category;
        this.lib = lib;}
    public Category() {}

    public int getId_category() {
        return id_category;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }
}
