/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.medicine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import org.springframework.samples.petclinic.model.NamedEntity;

/**
 * Simple JavaBean domain object representing an person.
 *
 * @author Ken Krebs
 */
@Entity
@Table(name = "medicines")
public class Medicine extends NamedEntity {

    @Column(name = "name")
    @NotEmpty
    private String name;

    @Column(name = "active_ingredients")
    @NotEmpty
    private String activeIngedients;
    
    @Column(name = "presentation")
    @NotEmpty
    private String presentation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActiveIngedients() {
        return activeIngedients;
    }

    public void setActiveIngedients(String active_ingedients) {
        this.activeIngedients = active_ingedients;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }
    
    

}
