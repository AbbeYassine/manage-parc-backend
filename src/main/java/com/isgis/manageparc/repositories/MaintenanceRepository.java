package com.isgis.manageparc.repositories;

import com.isgis.manageparc.models.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintenanceRepository extends JpaRepository <Maintenance,Integer> {
}
