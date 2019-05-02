package com.isgis.manageparc.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Voiture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String immatriculation;

    private String marque;

    private String modele;

    private String puissance;

    private String carburant;

    @Column(name = "date_mise_circulation")
    private Date dateMiseCirculation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getPuissance() {
        return puissance;
    }

    public void setPuissance(String puissance) {
        this.puissance = puissance;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public Date getDateMiseCirculation() {
        return dateMiseCirculation;
    }

    public void setDateMiseCirculation(Date dateMiseCirculation) {
        this.dateMiseCirculation = dateMiseCirculation;
    }
}
