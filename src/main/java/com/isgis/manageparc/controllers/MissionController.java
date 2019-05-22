package com.isgis.manageparc.controllers;

import com.isgis.manageparc.models.Employe;
import com.isgis.manageparc.models.Mission;
import com.isgis.manageparc.models.SimpleResponse;
import com.isgis.manageparc.models.Voiture;
import com.isgis.manageparc.models.dto.MissionDTO;
import com.isgis.manageparc.services.IEmployeService;
import com.isgis.manageparc.services.IMissionService;
import com.isgis.manageparc.services.IVoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mission")
public class MissionController {

    @Autowired
    private IMissionService missionService;

    @Autowired
    private IVoitureService voitureService;

    @Autowired
    private IEmployeService employeService;


    @GetMapping("")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Mission> getAll() {
        return missionService.getAll();
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Mission add(@RequestBody MissionDTO missionDTO) {


        Employe employe = employeService.getById(Integer.parseInt(missionDTO.getEmployeId()));

        Voiture voiture = voitureService.getById(Integer.parseInt(missionDTO.getVoitureId()));

        Mission mission = missionService.convertDTOToMission(missionDTO, employe, voiture);

        return missionService.add(mission);
    }

    @GetMapping("{missionId}")
    @ResponseStatus(HttpStatus.OK)
    public Mission getById(@PathVariable Integer missionId) {
        return missionService.getById(missionId);
    }

    @DeleteMapping("{missionId}")
    @ResponseStatus(HttpStatus.OK)
    public SimpleResponse deleteById(@PathVariable Integer missionId) {
        missionService.deleteById(missionId);
        return new SimpleResponse("Delete mission success");
    }

    @PutMapping("{missionId}")
    @ResponseStatus(HttpStatus.OK)
    public Mission getById(@PathVariable Integer missionId, @RequestBody Mission mission) {
        Mission missionData = missionService.getById(missionId);

        if (missionData != null) {
            return missionService.update(mission);
        }

        return null;
    }
}
