package com.isgis.manageparc.repositories;

import com.isgis.manageparc.models.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Integer> {

    List<Voiture> findByImmatriculationAndCarburant(String immat, String carb);

    @Query("select count(a) from Voiture where immatriculation = ?1")
    int countPerImm(String immat);


}
