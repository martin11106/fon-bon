/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.vet;

import java.util.Collection;
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
public class VetReportTest {
    
    public VetReportTest() {
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
     * Test of getVets method, of class VetReport.
     */
    @Test
    public void testGetVets() {
        System.out.println("getVets");
        VetReport instance = null;
        Collection<Vet> expResult = null;
        Collection<Vet> result = instance.getVets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidad method, of class VetReport.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        VetReport instance = null;
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
