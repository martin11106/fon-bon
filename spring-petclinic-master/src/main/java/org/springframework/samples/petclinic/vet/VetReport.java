/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.vet;

import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.samples.petclinic.vet.Vet;

/**
 *
 * @author replicacion
 */
@XmlRootElement
public class VetReport {
    private final Collection<Vet> vets;
    private final int cantidadVets;

    public VetReport(Collection<Vet> vets, int cantidadVets) {
        this.vets=vets;
        this.cantidadVets=cantidadVets;
    }
    @XmlElement
    public Collection<Vet> getVets(){
        return vets;
    }
    @XmlElement
    public int getCantidad() {
        return cantidadVets;
    }
    
}
