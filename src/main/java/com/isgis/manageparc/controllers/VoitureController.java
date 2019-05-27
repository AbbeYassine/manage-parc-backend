package com.isgis.manageparc.controllers;

import com.isgis.manageparc.models.SimpleResponse;
import com.isgis.manageparc.models.Voiture;
import com.isgis.manageparc.services.IVoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/voiture")
public class VoitureController {

    @Autowired
    private IVoitureService voitureService;

    @GetMapping("")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Voiture> getAll() {
        return voitureService.getAll();
    }

    @GetMapping("/disponible")
    @ResponseStatus(HttpStatus.OK)
    public List<Voiture> getAllDisponible() {
        return voitureService.getAllDisponible();
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Voiture add(@RequestBody Voiture voiture) {
        return voitureService.add(voiture);
    }

    @GetMapping("{voitureId}")
    @ResponseStatus(HttpStatus.OK)
    public Voiture getById(@PathVariable Integer voitureId) {
        return voitureService.getById(voitureId);
    }

    @DeleteMapping("{voitureId}")
    @ResponseStatus(HttpStatus.OK)
    public SimpleResponse deleteById(@PathVariable Integer voitureId) {
        voitureService.deleteById(voitureId);
        return new SimpleResponse("Delete voiture success");
    }

    @PutMapping("{voitureId}")
    @ResponseStatus(HttpStatus.OK)
    public Voiture getById(@PathVariable Integer voitureId, @RequestBody Voiture voiture) {
        Voiture voitureData = voitureService.getById(voitureId);

        if (voitureData != null) {
            return voitureService.update(voiture);
        }

        return null;
    }
}
