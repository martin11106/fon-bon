/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.owner;


import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author replicacion
 */
@XmlRootElement
public class PetReport {
    private final Collection<Pet> pets;
    private final int cantidadPets;

    public PetReport(Collection<Pet> pets, int cantidadPets) {
        this.pets=pets;
        this.cantidadPets=cantidadPets;
    }
    @XmlElement
    public Collection<Pet> getPets(){
        return pets;
    }
    @XmlElement
    public int getCantidad() {
        return cantidadPets;
    }
    
}
