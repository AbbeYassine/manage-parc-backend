package com.isgis.manageparc.models.dto;

public class MaintenanceDTO {


    private String voitureId;

    private String datemaintenance;

    private String kilometrage;

    private String montant;

    public String getVoitureId() {
        return voitureId;
    }

    public void setVoitureId(String voitureId) {
        this.voitureId = voitureId;
    }

    public String getDatemaintenance() {
        return datemaintenance;
    }

    public void setDatemaintenance(String datemaintenance) {
        this.datemaintenance = datemaintenance;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public String getKilometrage() { return kilometrage; }

    public void setKilometrage(String kilometrage) {
        this.kilometrage = kilometrage;
    }

}
