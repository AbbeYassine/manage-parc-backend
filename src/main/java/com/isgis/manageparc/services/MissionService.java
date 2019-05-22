package com.isgis.manageparc.services;


import com.isgis.manageparc.models.Employe;
import com.isgis.manageparc.models.Mission;
import com.isgis.manageparc.models.Voiture;
import com.isgis.manageparc.models.dto.MissionDTO;
import com.isgis.manageparc.repositories.MissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissionService implements IMissionService {

    @Autowired
    private MissionRepository missionRepository;

    @Override
    public List<Mission> getAll() {
        return missionRepository.findAll();
    }

    @Override
    public Mission add(Mission mission) {
        return missionRepository.save(mission);
    }

    @Override
    public Mission getById(Integer missionId) {
        return missionRepository.findById(missionId).orElse(null);
    }

    @Override
    public Mission update(Mission mission) {
        return missionRepository.save(mission);
    }

    @Override
    public void deleteById(Integer missionId) {
        missionRepository.deleteById(missionId);
    }

    @Override
    public Mission convertDTOToMission(MissionDTO missionDTO, Employe employe, Voiture voiture) {
        Mission mission = new Mission();
        mission.setDateDebut(missionDTO.getDateDebut());
        mission.setDateFin(missionDTO.getDateFin());
        mission.setEmploye(employe);
        mission.setVoiture(voiture);
        mission.setMontant(missionDTO.getMontant());
        mission.setObjet(missionDTO.getObjet());

        return mission;
    }
}
