/*
 * Copyright 2012-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.vet;

import java.util.Collection;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import javax.validation.Valid;
import org.springframework.samples.petclinic.owner.Owner;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Juergen Hoeller
 * @author Mark Fisher
 * @author Ken Krebs
 * @author Arjen Poutsma
 */
@Controller
class VetController {

    private final VetRepository vets;

    public VetController(VetRepository clinicService) {
        this.vets = clinicService;
    }
    
    @ModelAttribute("specialties")
    public Collection<Specialty> populateSpecialties() {
        return this.vets.findSpecialties();
    }
    
    @GetMapping("/vets/new")
    public String initCreationForm(Map<String, Object> model) {
    Vet vet=new Vet();
        model.put("vet", vet);//duda
        return "Vets/createOrUpdatevetsForm";
    } 
    @PostMapping("/vets/new")
    public String processCreationForm(@Valid Vet vet, BindingResult result) {
        if (result.hasErrors()) {
            return "Vets/createOrUpdatevetsForm";
        } else {
            this.vets.save(vet);
            return "redirect:/vets/" + vet.getId();
        }
    }
    @GetMapping("/vets/find")
    public String initBuscarForm(Map<String, Object> model) {
        model.put("vet", new Vet());
        return "vets/findvets";
    }
    
    @GetMapping("/vets.html")
    public String showVetList(Vet vet, BindingResult result, Map<String, Object> model) {
        // Here we are returning an object of type 'Vets' rather than a collection of Vet
       if (vet.getLastName() == null) {
            vet.setLastName(""); // empty string signifies broadest possible search
        }

        // find owners by last name
        Collection<Vet> results = this.vets.findByLastName(vet.getLastName());
        if (results.isEmpty()) {
            // no owners found
            result.rejectValue("lastName", "notFound", "not found");
            return "vets/findvets";
        } else if (results.size() == 1) {
            // 1 owner found
            vet = results.iterator().next();
            return "redirect:/vets/" + vet.getId();
        } else {
            // multiple owners found
            model.put("selections", results);
            return "vets/vetList";
        }
    }
    
    @GetMapping("/vets2.html")
    public String initFindForm(Map<String, Object> model) {
        model.put("vets", new Vet());
        return "redirect:/vets.html?";
    }

    @GetMapping({ "/vets" })
    public @ResponseBody Vets showResourcesVetList() {
        // Here we are returning an object of type 'Vets' rather than a collection of Vet
        // objects so it is simpler for JSon/Object mapping
        Vets vets = new Vets();
        vets.getVetList().addAll(this.vets.findAll());
        return vets;
    }
    
    @GetMapping("/vets/{vetId}")
    public ModelAndView showOwner(@PathVariable("vetId") int vetId) {
        ModelAndView mav = new ModelAndView("vets/vetsDetails");
        mav.addObject(this.vets.findById(vetId));
        return mav;
    }
    
    @GetMapping("/vets/{vetId}/edit")
    public String initUpdateOwnerForm(@PathVariable("vetId") int vetId, ModelMap model) {
        Vet vet = this.vets.findById(vetId);
        model.put("vet", vet);
        return "Vets/createOrUpdatevetsForm";
    }
    
    @PostMapping("/vets/{vetId}/edit")
    public String processUpdateOwnerForm(@Valid Vet vet, BindingResult result, @PathVariable("vetId") int vetId) {
        if (result.hasErrors()) {
            return "Vets/createOrUpdatevetsForm";
        } else {
            vet.setId(vetId);
            this.vets.save(vet);
            return "redirect:/vets/{vetId}";
        }
    }
    
        @GetMapping("/vets/{vetId}/delete")
    public String processUpdatevetsForm( Vet vet, BindingResult result, @PathVariable("vetId") int vetId) {

              vet = this.vets.findById(vetId);
            this.vets.delete(vet);
            return "redirect:/vets.html?";
    }
}
