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
public class MedicineRepositoryTest {
    
    public MedicineRepositoryTest() {
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
     * Test of findByName method, of class MedicineRepository.
     */
    @Test
    public void testFindByName() {
        System.out.println("findByName");
        String name = "";
        MedicineRepository instance = new MedicineRepositoryImpl();
        Collection<Medicine> expResult = null;
        Collection<Medicine> result = instance.findByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class MedicineRepository.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Integer id = null;
        MedicineRepository instance = new MedicineRepositoryImpl();
        Medicine expResult = null;
        Medicine result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class MedicineRepository.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Medicine medicine = null;
        MedicineRepository instance = new MedicineRepositoryImpl();
        instance.save(medicine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numero method, of class MedicineRepository.
     */
    @Test
    public void testNumero() {
        System.out.println("numero");
        MedicineRepository instance = new MedicineRepositoryImpl();
        int expResult = 0;
        int result = instance.numero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class MedicineRepository.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        MedicineRepository instance = new MedicineRepositoryImpl();
        Collection<Medicine> expResult = null;
        Collection<Medicine> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class MedicineRepository.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Medicine medicine = null;
        MedicineRepository instance = new MedicineRepositoryImpl();
        instance.delete(medicine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MedicineRepositoryImpl implements MedicineRepository {

        public Collection<Medicine> findByName(String name) {
            return null;
        }

        public Medicine findById(Integer id) {
            return null;
        }

        public void save(Medicine medicine) {
        }

        public int numero() {
            return 0;
        }

        public Collection<Medicine> findAll() {
            return null;
        }

        public void delete(Medicine medicine) {
        }
    }
    
}
