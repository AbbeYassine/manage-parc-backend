package com.isgis.manageparc.services;

import com.isgis.manageparc.models.Voiture;
import com.isgis.manageparc.repositories.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoitureService implements IVoitureService {

    @Autowired
    private VoitureRepository voitureRepository;

    @Override
    public List<Voiture> getAll() {
        return voitureRepository.findAll();
    }

    @Override
    public Voiture add(Voiture voiture) {
        return voitureRepository.save(voiture);
    }

    @Override
    public Voiture getById(Integer voitureId) {
        return voitureRepository.findById(voitureId).orElse(null);
    }

    @Override
    public Voiture update(Voiture voiture) {
        return voitureRepository.save(voiture);
    }

    @Override
    public void deleteById(Integer voitureId) {
        voitureRepository.deleteById(voitureId);
    }

    @Override
    public void updateEtatVoiture(Voiture voiture, boolean etat) {
        voiture.setEtat(etat);
        voitureRepository.save(voiture);
    }

    @Override
    public List<Voiture> getAllDisponible() {
        return voitureRepository.findByEtat(true);
    }
}
