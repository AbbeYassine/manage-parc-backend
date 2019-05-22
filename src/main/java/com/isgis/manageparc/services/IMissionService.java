package com.isgis.manageparc.services;

import com.isgis.manageparc.models.Mission;


import java.util.List;

public interface IMissionService {
    List<Mission> getAll();

    Mission add(Mission mission);

    Mission getById(Integer missionId);

    Mission update(Mission mission);

    void deleteById(Integer missionId);
}
