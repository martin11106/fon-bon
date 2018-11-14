/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.system;

import java.util.Map;
import org.springframework.samples.petclinic.owner.PetRepository;
import org.springframework.samples.petclinic.vet.VetRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.samples.petclinic.owner.PetReport;
import org.springframework.samples.petclinic.vet.VetReport;

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
        VetReport vetReport = new VetReport(this.vets.findAll(), this.vets.numero());
        model.put("vetReport", vetReport);
        return "vets/vetReport";
    }
    
    @GetMapping("/petReport.html")
    public String showPetList(Map<String, Object> model) {
        // Here we are returning an object of type 'Pets' rather than a collection of Pet
        // objects so it is simpler for Object-Xml mapping
        PetReport petReport = new PetReport(this.pets.findAll(), this.pets.numero());
        model.put("petReport", petReport);
        return "pets/petReport";
    }
}
