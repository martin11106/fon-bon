/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.medicine;

import org.assertj.core.util.Lists;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
/**
 *
 * @author johan
 */
@RunWith(SpringRunner.class)
@WebMvcTest(MedicineController.class)
public class MedicineControllerTests {
    
    private static final int TEST_MEDICINE_ID = 1;
    
    @Autowired
    private MockMvc mockMvc;
    
    @MockBean
    private MedicineRepository medicines;
    
    private Medicine paracetamol;
    
    public MedicineControllerTests() {
    }
    
    @Before
    public void setUp() {
        paracetamol = new Medicine();
        paracetamol.setId(TEST_MEDICINE_ID);
        paracetamol.setName("Paracetamol");
        paracetamol.setActiveIngredients("Pseudoefedrina");
        paracetamol.setPresentation("Capsulas");
        given(this.medicines.findById(TEST_MEDICINE_ID)).willReturn(paracetamol);
    }

    @Test
    public void testInitCreationForm() throws Exception {
       mockMvc.perform(get("/medicines/new"))
               .andExpect(status().isOk())
               .andExpect(model().attributeExists("medicine"))
               .andExpect(view().name("medicines/createOrUpdateMedicineForm"));
    }

    
    @Test
    public void testProcessCreationFormSuccess() throws Exception{
        mockMvc.perform(post("/medicines/new")
               .param("name", "Paracetamol")
               .param("active_ingredients", "Pseudoefedrina")
               .param("presentation", "Capsulas")
        )
               .andExpect(status().is3xxRedirection());
    }
    
    @Test
    public void testProcessCreationFormHasErrors() throws Exception{
        mockMvc.perform(post("/medicines/new")
            .param("name", "Amoxicilina")
            .param("active_ingredients", "Amoxicilina trihidrato")
        )
            .andExpect(status().isOk())
            .andExpect(model().attributeHasErrors("medicine"))
            .andExpect(model().attributeHasFieldErrors("medicine", "presentation"))
            .andExpect(view().name("medicines/createOrUpdateMedicineForm"));
    }

    @Test
    public void testInitFindForm() throws Exception {
        mockMvc.perform(get("/medicines/find"))
                .andExpect(status().isOk())
                .andExpect(model().attributeExists("medicine"))
                .andExpect(view().name("medicines/findMedicines"));
    }

    @Test
    public void testProcessFindFormSuccess() throws Exception {
        given(this.medicines.findByName("")).willReturn(Lists.newArrayList(paracetamol, new Medicine()));
        mockMvc.perform(get("/medicines"))
                .andExpect(status().isOk())
                .andExpect(view().name("medicines/medicinesList"));
    }

    @Test
    public void testProcessFindFormByName() throws Exception {
        given(this.medicines.findByName(paracetamol.getName())).willReturn(Lists.newArrayList(paracetamol));
        mockMvc.perform(get("/medicines")
                .param("name", "Amoxicilina")
        )
                .andExpect(status().is3xxRedirection())
                .andExpect(view().name("redirect:/medicines/" + TEST_MEDICINE_ID));
    }

    @Test
    public void testProcessFindFormNoMedicinesFound() throws Exception {
        mockMvc.perform(get("/medicines")
                .param("name", "Unknown name")
        )
                .andExpect(status().isOk())
                .andExpect(model().attributeHasFieldErrors("medicine", "name"))
                .andExpect(model().attributeHasFieldErrorCode("medicine", "name", "notFound"))
                .andExpect(view().name("medicines/findMedicines"));
    }

    @Test
    public void testInitUpdateMedicineForm() throws Exception {
        mockMvc.perform(get("/medicines/{medicineId}/edit", TEST_MEDICINE_ID))
            .andExpect(status().isOk())
            .andExpect(model().attributeExists("medicine"))
            .andExpect(model().attribute("medicine", hasProperty("name", is("Paracetamol"))))
            .andExpect(model().attribute("medicne", hasProperty("active_ingredients", is("Paracetamol trihidrato"))))
            .andExpect(model().attribute("medicine", hasProperty("presentation", is("Bebida"))))
            .andExpect(view().name("medicines/createOrUpdateForm"));
    }
    
    @Test
    public void testProcessUpdateMedicineFormSuccess() throws Exception{
        mockMvc.perform(post("/medicines/{medicineId}/edit", TEST_MEDICINE_ID)
                .param("name", "Paracetamol")
                .param("active_ingredients", "Paracetamol trihidrato")
                .param("presentation", "Bebida")
        )
                .andExpect(status().is3xxRedirection())
                .andExpect(view().name("redirect:/medicines/{medicineId}"));
    }
    
    @Test
    public void testProcessUpdateMedicineFormHasErrors() throws Exception{
        mockMvc.perform(post("/medicines/{medicineId}/edit", TEST_MEDICINE_ID)
            .param("name", "Amoxicilina")
            .param("active_ingredients", "Amoxicilina trihidrato")
        )
            .andExpect(status().isOk())
            .andExpect(model().attributeHasErrors("medicine"))
            .andExpect(model().attributeHasFieldErrors("medicine", "presentation"))
            .andExpect(view().name("medicines/createOrUpdateMedicineForm"));
    }
    
    @Test
    public void testShowMedicine() throws Exception {
        mockMvc.perform(get("/medicines/{medicineId}", TEST_MEDICINE_ID))
                .andExpect(status().isOk())
                .andExpect(model().attribute("medicine", hasProperty("name", is("Paracetamol"))))
                .andExpect(model().attribute("medicine", hasProperty("active_ingredients", is("Paracetamol trihidrato"))))
                .andExpect(model().attribute("medicine", hasProperty("presentation", is("Bebida"))))
                .andExpect(view().name("medicines/medicineDetails"));
    }
    
}
