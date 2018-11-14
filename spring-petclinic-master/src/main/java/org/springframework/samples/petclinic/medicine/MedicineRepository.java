/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.medicine;

import java.util.Collection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author johan
 */
public interface MedicineRepository extends Repository<Medicine, Integer> {
    
    @Query("SELECT DISTINCT medicine FROM Medicine medicine WHERE medicine.name LIKE :name%")
    @Transactional(readOnly = true)
    Collection<Medicine> findByName(@Param("name") String name);
    
    @Query("SELECT medicine FROM Medicine medicine WHERE medicine.id =:id")
    @Transactional(readOnly = true)
    Medicine findById(@Param("id") Integer id);
    
    void save(Medicine medicine);
    
    @Query("SELECT COUNT(id) FROM Medicine")
    @Transactional(readOnly = true)
    int numero();
    
    @Query("SELECT medicine FROM Medicine medicine ORDER BY medicine.name")
    @Transactional(readOnly = true)
    Collection<Medicine> findAll();
    
    void delete(Medicine medicine);
    
}
