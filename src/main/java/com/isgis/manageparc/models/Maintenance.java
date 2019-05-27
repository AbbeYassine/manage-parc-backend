package com.isgis.manageparc.models;

import javax.persistence.*;

@Entity
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "voiture_id")
    private Voiture voiture;

    private String kilometrage;

    private String montant;

    private String datemaintenance;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public String getDatemaintenance() {
        return datemaintenance;
    }

    public void setDatemaintenance(String datemaintenance) {
        this.datemaintenance = datemaintenance;

    }

    public String getObjet() {
        return kilometrage;
    }

    public void setObjet(String objet) {
        this.kilometrage = kilometrage;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }}



