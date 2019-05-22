package com.isgis.manageparc.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


    @Entity
    public class Mission {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;

        private String voiture;

        private String employe;

        private String dateDebut;

        private String datefin;

        private String montant;

        private String objet;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getDateDebut() {
            return dateDebut;
        }

        public void setDateDebut(String dateDebut) {
            this.dateDebut = dateDebut;
        }

        public String getDatefin() {
            return datefin;
        }

        public void setDatefin(String datefin) {
            this.datefin = datefin;
        }

        public String getEmploye() {
            return employe;
        }

        public void setEmploye(String employe) {
            this.employe = employe;
        }

        public String getVoiture() {
            return voiture;
        }

        public void setVoiture(String voiture) {
            this.voiture = voiture;
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
