package com.oussema.Projet_Rest.model;

import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id_category;
    private String name;


    @Override
    public String toString() {
        return "Category{" +
                "id_category=" + id_category +
                ", name='" + name + '\'' +
                '}';
    }

    public Category(String name) {
        this.name = name;}
    public Category() {}

    public int getId_category() {
        return id_category;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
