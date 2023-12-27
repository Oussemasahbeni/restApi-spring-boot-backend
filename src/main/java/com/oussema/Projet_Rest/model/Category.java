package com.oussema.Projet_Rest.model;

import jakarta.persistence.*;

import java.util.Date;

enum Status {
    published,
    draft,
    waiting
}

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id_category;
    private String name;
    private Status status;
    private Date date_created;


    @Override
    public String toString() {
        return "Category{" +
                "id_category=" + id_category +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", date_created=" + date_created +
                '}';
    }

    public Category(int id_category, String name, Status status, Date date_created) {
        this.id_category = id_category;
        this.name = name;
        this.status = status;
        this.date_created = date_created;
    }

    public Category() {}

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }




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
