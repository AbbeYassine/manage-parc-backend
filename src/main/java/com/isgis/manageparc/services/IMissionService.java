package com.isgis.manageparc.services;

import com.isgis.manageparc.models.Employe;
import com.isgis.manageparc.models.Mission;
import com.isgis.manageparc.models.Voiture;
import com.isgis.manageparc.models.dto.MissionDTO;


import java.util.List;

public interface IMissionService {
    List<Mission> getAll();

    Mission add(Mission mission);

    Mission getById(Integer missionId);

    Mission update(Mission mission);

    void deleteById(Integer missionId);

    Mission convertDTOToMission(MissionDTO missionDTO, Employe employe, Voiture voiture);
}
