/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.medicine;

import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author replicacion
 */
public class MedicineControllerTest {
    
    public MedicineControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setAllowedFields method, of class MedicineController.
     */
    @Test
    public void testSetAllowedFields() {
        System.out.println("setAllowedFields");
        WebDataBinder dataBinder = null;
        MedicineController instance = null;
        instance.setAllowedFields(dataBinder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initCreationForm method, of class MedicineController.
     */
    @Test
    public void testInitCreationForm() {
        System.out.println("initCreationForm");
        Map<String, Object> model = null;
        MedicineController instance = null;
        String expResult = "";
        String result = instance.initCreationForm(model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processCreationForm method, of class MedicineController.
     */
    @Test
    public void testProcessCreationForm() {
        System.out.println("processCreationForm");
        Medicine medicine = null;
        BindingResult result_2 = null;
        MedicineController instance = null;
        String expResult = "";
        String result = instance.processCreationForm(medicine, result_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initFindForm method, of class MedicineController.
     */
    @Test
    public void testInitFindForm() {
        System.out.println("initFindForm");
        Map<String, Object> model = null;
        MedicineController instance = null;
        String expResult = "";
        String result = instance.initFindForm(model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processFindForm method, of class MedicineController.
     */
    @Test
    public void testProcessFindForm() {
        System.out.println("processFindForm");
        Medicine medicine = null;
        BindingResult result_2 = null;
        Map<String, Object> model = null;
        MedicineController instance = null;
        String expResult = "";
        String result = instance.processFindForm(medicine, result_2, model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initUpdateMedicineForm method, of class MedicineController.
     */
    @Test
    public void testInitUpdateMedicineForm() {
        System.out.println("initUpdateMedicineForm");
        int medicineId = 0;
        Model model = null;
        MedicineController instance = null;
        String expResult = "";
        String result = instance.initUpdateMedicineForm(medicineId, model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initDeleteMedicineForm method, of class MedicineController.
     */
    @Test
    public void testInitDeleteMedicineForm() {
        System.out.println("initDeleteMedicineForm");
        int medicineId = 0;
        Model model = null;
        MedicineController instance = null;
        String expResult = "";
        String result = instance.initDeleteMedicineForm(medicineId, model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processUpdateMedicineForm method, of class MedicineController.
     */
    @Test
    public void testProcessUpdateMedicineForm() {
        System.out.println("processUpdateMedicineForm");
        Medicine medicine = null;
        BindingResult result_2 = null;
        int medicineId = 0;
        MedicineController instance = null;
        String expResult = "";
        String result = instance.processUpdateMedicineForm(medicine, result_2, medicineId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showMedicine method, of class MedicineController.
     */
    @Test
    public void testShowMedicine() {
        System.out.println("showMedicine");
        int medicineId = 0;
        MedicineController instance = null;
        ModelAndView expResult = null;
        ModelAndView result = instance.showMedicine(medicineId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
