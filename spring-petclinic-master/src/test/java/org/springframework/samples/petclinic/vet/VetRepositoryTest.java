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
public class VetRepositoryTest {
    
    public VetRepositoryTest() {
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
     * Test of findAll method, of class VetRepository.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        VetRepository instance = new VetRepositoryImpl();
        Collection<Vet> expResult = null;
        Collection<Vet> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class VetRepository.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Integer id = null;
        VetRepository instance = new VetRepositoryImpl();
        Vet expResult = null;
        Vet result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByLastName method, of class VetRepository.
     */
    @Test
    public void testFindByLastName() {
        System.out.println("findByLastName");
        String lastName = "";
        VetRepository instance = new VetRepositoryImpl();
        Collection<Vet> expResult = null;
        Collection<Vet> result = instance.findByLastName(lastName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class VetRepository.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Vet vet = null;
        VetRepository instance = new VetRepositoryImpl();
        instance.save(vet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class VetRepository.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Vet vet = null;
        VetRepository instance = new VetRepositoryImpl();
        instance.delete(vet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numero method, of class VetRepository.
     */
    @Test
    public void testNumero() {
        System.out.println("numero");
        VetRepository instance = new VetRepositoryImpl();
        int expResult = 0;
        int result = instance.numero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class VetRepositoryImpl implements VetRepository {

        public Collection<Vet> findAll() {
            return null;
        }

        public Vet findById(Integer id) {
            return null;
        }

        public Collection<Vet> findByLastName(String lastName) {
            return null;
        }

        public void save(Vet vet) {
        }

        public void delete(Vet vet) {
        }

        public int numero() {
            return 0;
        }
    }

    public class VetRepositoryImpl implements VetRepository {

        public Collection<Vet> findAll() {
            return null;
        }

        public Vet findById(Integer id) {
            return null;
        }

        public Collection<Vet> findByLastName(String lastName) {
            return null;
        }

        public void save(Vet vet) {
        }

        public void delete(Vet vet) {
        }

        public int numero() {
            return 0;
        }
    }
    
}
