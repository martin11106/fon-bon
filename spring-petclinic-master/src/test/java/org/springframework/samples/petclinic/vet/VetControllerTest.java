/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.vet;

import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author replicacion
 */
public class VetControllerTest {
    
    public VetControllerTest() {
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
     * Test of initCreationForm method, of class VetController.
     */
    @Test
    public void testInitCreationForm() {
        System.out.println("initCreationForm");
        Map<String, Object> model = null;
        VetController instance = null;
        String expResult = "";
        String result = instance.initCreationForm(model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processCreationForm method, of class VetController.
     */
    @Test
    public void testProcessCreationForm() {
        System.out.println("processCreationForm");
        Vet vet = null;
        BindingResult result_2 = null;
        VetController instance = null;
        String expResult = "";
        String result = instance.processCreationForm(vet, result_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showVetList method, of class VetController.
     */
    @Test
    public void testShowVetList() {
        System.out.println("showVetList");
        Vet vet = null;
        BindingResult result_2 = null;
        Map<String, Object> model = null;
        VetController instance = null;
        String expResult = "";
        String result = instance.showVetList(vet, result_2, model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initFindForm method, of class VetController.
     */
    @Test
    public void testInitFindForm() {
        System.out.println("initFindForm");
        Map<String, Object> model = null;
        VetController instance = null;
        String expResult = "";
        String result = instance.initFindForm(model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showResourcesVetList method, of class VetController.
     */
    @Test
    public void testShowResourcesVetList() {
        System.out.println("showResourcesVetList");
        VetController instance = null;
        Vets expResult = null;
        Vets result = instance.showResourcesVetList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showOwner method, of class VetController.
     */
    @Test
    public void testShowOwner() {
        System.out.println("showOwner");
        int vetId = 0;
        VetController instance = null;
        ModelAndView expResult = null;
        ModelAndView result = instance.showOwner(vetId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initUpdateOwnerForm method, of class VetController.
     */
    @Test
    public void testInitUpdateOwnerForm() {
        System.out.println("initUpdateOwnerForm");
        int vetId = 0;
        ModelMap model = null;
        VetController instance = null;
        String expResult = "";
        String result = instance.initUpdateOwnerForm(vetId, model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processUpdateOwnerForm method, of class VetController.
     */
    @Test
    public void testProcessUpdateOwnerForm() {
        System.out.println("processUpdateOwnerForm");
        Vet vet = null;
        BindingResult result_2 = null;
        int vetId = 0;
        VetController instance = null;
        String expResult = "";
        String result = instance.processUpdateOwnerForm(vet, result_2, vetId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processUpdatevetsForm method, of class VetController.
     */
    @Test
    public void testProcessUpdatevetsForm() {
        System.out.println("processUpdatevetsForm");
        Vet vet = null;
        BindingResult result_2 = null;
        int vetId = 0;
        VetController instance = null;
        String expResult = "";
        String result = instance.processUpdatevetsForm(vet, result_2, vetId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
