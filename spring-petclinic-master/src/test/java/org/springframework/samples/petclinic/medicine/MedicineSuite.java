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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author replicacion
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({org.springframework.samples.petclinic.medicine.MedicineControllerTest.class, org.springframework.samples.petclinic.medicine.MedicineReportTest.class, org.springframework.samples.petclinic.medicine.MedicineRepositoryTest.class, org.springframework.samples.petclinic.medicine.MedicineTest.class})
public class MedicineSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
