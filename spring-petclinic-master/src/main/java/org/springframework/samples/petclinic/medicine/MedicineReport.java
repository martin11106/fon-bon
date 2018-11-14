/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.medicine;

import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author replicacion
 */
@XmlRootElement
public class MedicineReport {
    private final Collection<Medicine> medicines;
    private final int cantidadMedicines;

    public MedicineReport(Collection<Medicine> medicines, int cantidadMedicines) {
        this.medicines=medicines;
        this.cantidadMedicines=cantidadMedicines;
    }
    
    @XmlElement
    public Collection<Medicine> getMedicines(){
        return medicines;
    }
    
    @XmlElement
    public int getCantidad() {
        return cantidadMedicines;
    }
    
}
