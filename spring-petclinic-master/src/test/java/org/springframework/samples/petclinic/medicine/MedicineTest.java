/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.medicine;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author replicacion
 */
public class MedicineTest {
    
    public MedicineTest() {
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
     * Test of getActiveIngredients method, of class Medicine.
     */
    @Test
    public void testGetActiveIngredients() {
        System.out.println("getActiveIngredients");
        Medicine instance = new Medicine();
        String expResult = "";
        String result = instance.getActiveIngredients();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActiveIngredients method, of class Medicine.
     */
    @Test
    public void testSetActiveIngredients() {
        System.out.println("setActiveIngredients");
        String active_ingedients = "";
        Medicine instance = new Medicine();
        instance.setActiveIngredients(active_ingedients);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPresentation method, of class Medicine.
     */
    @Test
    public void testGetPresentation() {
        System.out.println("getPresentation");
        Medicine instance = new Medicine();
        String expResult = "";
        String result = instance.getPresentation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPresentation method, of class Medicine.
     */
    @Test
    public void testSetPresentation() {
        System.out.println("setPresentation");
        String presentation = "";
        Medicine instance = new Medicine();
        instance.setPresentation(presentation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
