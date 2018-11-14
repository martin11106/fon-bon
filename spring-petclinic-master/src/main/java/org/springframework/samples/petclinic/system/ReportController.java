/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.system;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.owner.PetRepository;
import org.springframework.samples.petclinic.owner.Pets;
import org.springframework.samples.petclinic.vet.VetRepository;
import org.springframework.samples.petclinic.vet.Vets;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author replicacion
 */
@Controller
public class ReportController {
    private final VetRepository vets;
    private final PetRepository pets;


    public ReportController(VetRepository vets, PetRepository pets) {
        this.vets = vets;
        this.pets = pets;
    }
    
    @GetMapping("reports.html")
    public String welcome() {
        return "reports";
    }
    
    @GetMapping("/vetReport.html")
    public String showVetList(Map<String, Object> model) {
        // Here we are returning an object of type 'Vets' rather than a collection of Vet
        // objects so it is simpler for Object-Xml mapping
        Vets vets = new Vets();
        vets.getVetList().addAll(this.vets.findAll());
        model.put("vets", vets);
        return "vets/vetReport";
    }
    
    @GetMapping("/petReport.html")
    public String showPetList(Map<String, Object> model) {
        // Here we are returning an object of type 'Pets' rather than a collection of Pet
        // objects so it is simpler for Object-Xml mapping
        Pets pets = new Pets();
        pets.getPetList().addAll(this.pets.findAll());
        model.put("pets", pets);
        return "pets/petReport";
    }
}
