package com.isgis.manageparc.services;

import com.isgis.manageparc.models.Employe;

import java.util.List;

public interface IEmployeService {
    List<Employe> getAll();

    Employe add(Employe voiture);

    Employe getById(Integer employeId);

    Employe update(Employe employe);

    void deleteById(Integer employeId);
}
