/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.system;

import java.util.Map;
import org.springframework.samples.petclinic.medicine.MedicineReport;
import org.springframework.samples.petclinic.medicine.MedicineRepository;
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
    private final MedicineRepository medicines;


    public ReportController(VetRepository vets, PetRepository pets, MedicineRepository medicines) {
        this.vets = vets;
        this.pets = pets;
        this.medicines = medicines; 
    }
    
    @GetMapping("reports.html")
    public String welcome() {
        return "reports";
    }
    
    @GetMapping("/vetReport.html")
    public String showVetList(Map<String, Object> model) {
        VetReport vetReport = new VetReport(this.vets.findAll(), this.vets.numero());
        model.put("vetReport", vetReport);
        return "vets/vetReport";
    }
    
    @GetMapping("/petReport.html")
    public String showPetList(Map<String, Object> model) {
        PetReport petReport = new PetReport(this.pets.findAll(), this.pets.numero());
        model.put("petReport", petReport);
        return "pets/petReport";
    }
    
    @GetMapping("/medicineReport.html")
    public String showMedicineList(Map<String, Object> model) {
        MedicineReport medicineReport = new MedicineReport(this.medicines.findAll(), this.medicines.numero());
        model.put("medicineReport", medicineReport);
        return "medicines/medicineReport";
    }
}
