package com.isgis.manageparc.models.dto;

public class MissionDTO {

    private String voitureId;

    private String employeId;

    private String dateDebut;

    private String dateFin;

    private String montant;

    private String objet;


    public String getVoitureId() {
        return voitureId;
    }

    public void setVoitureId(String voitureId) {
        this.voitureId = voitureId;
    }

    public String getEmployeId() {
        return employeId;
    }

    public void setEmployeId(String employeId) {
        this.employeId = employeId;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }
}
