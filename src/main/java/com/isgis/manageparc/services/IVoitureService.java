package com.isgis.manageparc.services;

import com.isgis.manageparc.models.Voiture;

import java.util.List;

public interface IVoitureService {
    List<Voiture> getAll();

    Voiture add(Voiture voiture);

    Voiture getById(Integer voitureId);

    Voiture update(Voiture voiture);

    void deleteById(Integer voitureId);

    void updateEtatVoiture(Voiture voiture, boolean etat);

    List<Voiture> getAllDisponible();
}
