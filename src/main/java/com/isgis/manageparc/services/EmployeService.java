package com.isgis.manageparc.services;

import com.isgis.manageparc.models.Employe;
import com.isgis.manageparc.repositories.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService implements IEmployeService {


    @Autowired
    private EmployeRepository employeRepository;

    @Override
    public List<Employe> getAll() {
        return employeRepository.findAll();
    }

    @Override
    public Employe add(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe getById(Integer employeId) {
        return employeRepository.findById(employeId).orElse(null);
    }

    @Override
    public Employe update(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public void deleteById(Integer employeId) {
        employeRepository.deleteById(employeId);
    }
}
