/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.medicine;

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
public class MedicineReportTest {
    
    public MedicineReportTest() {
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
     * Test of getMedicines method, of class MedicineReport.
     */
    @Test
    public void testGetMedicines() {
        System.out.println("getMedicines");
        MedicineReport instance = null;
        Collection<Medicine> expResult = null;
        Collection<Medicine> result = instance.getMedicines();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidad method, of class MedicineReport.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        MedicineReport instance = null;
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
