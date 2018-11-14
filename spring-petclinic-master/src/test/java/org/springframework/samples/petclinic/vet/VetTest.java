/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.vet;

import java.util.List;
import java.util.Set;
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
public class VetTest {
    
    public VetTest() {
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
     * Test of getHora_fin method, of class Vet.
     */
    @Test
    public void testGetHora_fin() {
        System.out.println("getHora_fin");
        Vet instance = new Vet();
        String expResult = "";
        String result = instance.getHora_fin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHora_fin method, of class Vet.
     */
    @Test
    public void testSetHora_fin() {
        System.out.println("setHora_fin");
        String hora_fin = "";
        Vet instance = new Vet();
        instance.setHora_fin(hora_fin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpecialties2 method, of class Vet.
     */
    @Test
    public void testGetSpecialties2() {
        System.out.println("getSpecialties2");
        Vet instance = new Vet();
        String expResult = "";
        String result = instance.getSpecialties2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHorario method, of class Vet.
     */
    @Test
    public void testGetHorario() {
        System.out.println("getHorario");
        Vet instance = new Vet();
        String expResult = "";
        String result = instance.getHorario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHorario method, of class Vet.
     */
    @Test
    public void testSetHorario() {
        System.out.println("setHorario");
        String horario = "";
        Vet instance = new Vet();
        instance.setHorario(horario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpecialties2 method, of class Vet.
     */
    @Test
    public void testSetSpecialties2() {
        System.out.println("setSpecialties2");
        String specialties2 = "";
        Vet instance = new Vet();
        instance.setSpecialties2(specialties2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelephone method, of class Vet.
     */
    @Test
    public void testGetTelephone() {
        System.out.println("getTelephone");
        Vet instance = new Vet();
        String expResult = "";
        String result = instance.getTelephone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelephone method, of class Vet.
     */
    @Test
    public void testSetTelephone() {
        System.out.println("setTelephone");
        String telephone = "";
        Vet instance = new Vet();
        instance.setTelephone(telephone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpecialtiesInternal method, of class Vet.
     */
    @Test
    public void testGetSpecialtiesInternal() {
        System.out.println("getSpecialtiesInternal");
        Vet instance = new Vet();
        Set<Specialty> expResult = null;
        Set<Specialty> result = instance.getSpecialtiesInternal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpecialtiesInternal method, of class Vet.
     */
    @Test
    public void testSetSpecialtiesInternal() {
        System.out.println("setSpecialtiesInternal");
        Set<Specialty> specialties = null;
        Vet instance = new Vet();
        instance.setSpecialtiesInternal(specialties);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpecialties method, of class Vet.
     */
    @Test
    public void testGetSpecialties() {
        System.out.println("getSpecialties");
        Vet instance = new Vet();
        List<Specialty> expResult = null;
        List<Specialty> result = instance.getSpecialties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNrOfSpecialties method, of class Vet.
     */
    @Test
    public void testGetNrOfSpecialties() {
        System.out.println("getNrOfSpecialties");
        Vet instance = new Vet();
        int expResult = 0;
        int result = instance.getNrOfSpecialties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSpecialty method, of class Vet.
     */
    @Test
    public void testAddSpecialty() {
        System.out.println("addSpecialty");
        Specialty specialty = null;
        Vet instance = new Vet();
        instance.addSpecialty(specialty);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
