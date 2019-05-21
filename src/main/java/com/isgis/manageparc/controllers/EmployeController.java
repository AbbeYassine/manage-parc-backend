package com.isgis.manageparc.controllers;

import com.isgis.manageparc.models.SimpleResponse;
import com.isgis.manageparc.models.Employe;
import com.isgis.manageparc.services.IEmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/employe")

public class EmployeController {

        @Autowired
        private IEmployeService employeService;

        @GetMapping("")
        @ResponseStatus(HttpStatus.ACCEPTED)
        public List<Employe> getAll() {
            return employeService.getAll();
        }

        @PostMapping("")
        @ResponseStatus(HttpStatus.CREATED)
        public Employe add(@RequestBody Employe employe) {
            return employeService.add(employe);
        }

        @GetMapping("{employeId}")
        @ResponseStatus(HttpStatus.OK)
        public Employe getById(@PathVariable Integer employeId) {
            return employeService.getById(employeId);
        }

        @DeleteMapping("{employeId}")
        @ResponseStatus(HttpStatus.OK)
        public SimpleResponse deleteById(@PathVariable Integer employeId) {
            employeService.deleteById(employeId);
            return new SimpleResponse("Delete employe success");
        }

        @PutMapping("{employeId}")
        @ResponseStatus(HttpStatus.OK)
        public Employe getById(@PathVariable Integer employeId, @RequestBody Employe employe) {
            Employe employeData = emlpoyeService.getById(employeId);

            if (employeData != null) {
                return employeService.update(employe);
            }

            return null;
        }






















}
