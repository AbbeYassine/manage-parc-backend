package com.isgis.manageparc.services;



import com.isgis.manageparc.models.Maintenance;
import com.isgis.manageparc.models.Voiture;
import com.isgis.manageparc.models.dto.MaintenanceDTO;
import com.isgis.manageparc.repositories.MaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenanceService implements IMaintenanceService {

    @Autowired
    private MaintenanceRepository maintenanceRepository;

    @Override
    public List<Maintenance> getAll() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Maintenance add(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance getById(Integer maintenanceId) {
        return maintenanceRepository.findById(maintenanceId).orElse(null);
    }

    @Override
    public Maintenance update(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public void deleteById(Integer missionId) {
        maintenanceRepository.deleteById(maintenanceId);
    }

    @Override
    public Maintenance convertDTOToMaintenance(MaintenanceDTO maintenanceDTO, Voiture voiture) {
        Maintenance maintenance = new Maintenance();
        maintenance.setDatemaintenance(maintenanceDTO.getDatemaintenance());
        maintenance.setVoiture(voiture);
        maintenance.setMontant(maintenanceDTO.getMontant());
        maintenance.setkilometrage(maintenanceDTO.getKilometrage());

        return maintenance;
    }
}
