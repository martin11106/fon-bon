/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.vet;

import java.util.Locale;
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
public class SpecialtyFormatterTest {
    
    public SpecialtyFormatterTest() {
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
     * Test of print method, of class SpecialtyFormatter.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        Specialty specialty = null;
        Locale locale = null;
        SpecialtyFormatter instance = null;
        String expResult = "";
        String result = instance.print(specialty, locale);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parse method, of class SpecialtyFormatter.
     */
    @Test
    public void testParse() throws Exception {
        System.out.println("parse");
        String text = "";
        Locale locale = null;
        SpecialtyFormatter instance = null;
        Specialty expResult = null;
        Specialty result = instance.parse(text, locale);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
