package com.oussema.Projet_Rest.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id_produit;
    private String lib;
    private String prix;
    private String qte;
    @ManyToOne
    @JoinColumn(name= "id_categorie")
    private Category categorie;


    @Override
    public String toString() {
        return "product{" +
                "id_produit=" + id_produit +
                ", lib='" + lib + '\'' +
                ", prix='" + prix + '\'' +
                ", qte='" + qte + '\'' +
                ", categorie=" + categorie +
                '}';
    }

    public product(int id_produit, String lib, String prix, String qte, Category categorie) {
        this.id_produit = id_produit;
        this.lib = lib;
        this.prix = prix;
        this.qte = qte;
        this.categorie = categorie;
    }

    public product() {

    }


    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getQte() {
        return qte;
    }

    public void setQte(String qte) {
        this.qte = qte;
    }

    public Category getCategorie() {
        return categorie;
    }

    public void setCategorie(Category categorie) {
        this.categorie = categorie;
    }
}
