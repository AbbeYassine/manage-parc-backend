package com.isgis.manageparc.services;
import com.isgis.manageparc.models.Maintenance;
import com.isgis.manageparc.models.Voiture;
import com.isgis.manageparc.models.dto.MaintenanceDTO;


import java.util.List;

public interface IMaintenanceService {
    List<Maintenance> getAll();

    Maintenance add(Maintenance maintenance);

    Maintenance getById(Integer maintenanceId);

    Maintenance update(Maintenance maintenance);

    void deleteById(Integer maintenanceId);

    Maintenance convertDTOToMaintenance(MaintenanceDTO maintenanceDTO, Voiture voiture);
}







