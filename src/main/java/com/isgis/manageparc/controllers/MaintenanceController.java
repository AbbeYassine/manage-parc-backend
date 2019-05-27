package com.isgis.manageparc.controllers;

import com.isgis.manageparc.models.Maintenance;
import com.isgis.manageparc.models.Mission;
import com.isgis.manageparc.models.SimpleResponse;
import com.isgis.manageparc.models.Voiture;
import com.isgis.manageparc.models.dto.MaintenanceDTO;
import com.isgis.manageparc.services.IMaintenanceService;
import com.isgis.manageparc.services.IVoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/maintenance")

public class MaintenanceController {

    @Autowired
    private IMaintenanceService maintenanceService;

    @Autowired
    private IVoitureService voitureService;

    @GetMapping("")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Maintenance> getAll() {
        return maintenanceService.getAll();
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Maintenance add(@RequestBody MaintenanceDTO maintenanceDTO) {

        Voiture voiture = voitureService.getById(Integer.parseInt(maintenanceDTO.getVoitureId()));

        voiture.setEtat(false);

        Maintenance maintenance = maintenanceService.convertDTOToMaintenance(maintenanceDTO, voiture);

        return maintenanceService.add(maintenance);
    }

    @GetMapping("{maintenanceId}")
    @ResponseStatus(HttpStatus.OK)
    public Maintenance getById(@PathVariable Integer maintenanceId) {
        return maintenanceService.getById(maintenanceId);
    }

    @DeleteMapping("{maintenanceId}")
    @ResponseStatus(HttpStatus.OK)
    public SimpleResponse deleteById(@PathVariable Integer maintenanceId) {
        maintenanceService.deleteById(maintenanceId);
        return new SimpleResponse("Delete maintenance success");
    }

    @PutMapping("{maintenanceId}")
    @ResponseStatus(HttpStatus.OK)
    public Maintenance getById(@PathVariable Integer maintenanceId, @RequestBody Maintenance maintenance) {
        Maintenance maintenanceData = maintenanceService.getById(maintenanceId);

        if (maintenanceData != null) {
            return maintenanceService.update(maintenance);
        }

        return null;
    }


}
