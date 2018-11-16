package org.springframework.samples.petclinic.vet;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.assertj.core.util.Lists;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.BDDMockito.given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.samples.petclinic.owner.Owner;
import org.springframework.samples.petclinic.owner.OwnerRepository;
import org.springframework.samples.petclinic.owner.Pet;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Test class for the {@link VetController}
 */
@RunWith(SpringRunner.class)
@WebMvcTest(VetController.class)
public class VetControllerTests {
 private static final int TEST_VETS_ID = 1;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private VetRepository vets;

    private Vet george;
    private Specialty vet;

    @Before
    public void setup() {
        Specialty esp=new Specialty();
        george = new Vet();
        george.setId(TEST_VETS_ID);
        george.setFirstName("martin");
        george.setLastName("lopez");
        george.setTelephone("978823123");
        george.setHorario("11:0");
        george.setHora_fin("12:0");
      given(this.vets.findSpecialties()).willReturn(Lists.newArrayList(esp));
        given(this.vets.findById(TEST_VETS_ID)).willReturn(george);
    }

    
    @Test
    public void testInitFindForm() throws Exception {
        mockMvc.perform(get("/vets/find"))
            .andExpect(status().isOk())
            .andExpect(model().attributeExists("vet"))
            .andExpect(view().name("vets/findvets"));
    }


    @Test
    public void testShowOwner() throws Exception {
        mockMvc.perform(get("/vets/{etId}", TEST_VETS_ID))
            .andExpect(status().isOk())
            .andExpect(model().attribute("vet", hasProperty("lastName", is("lopez"))))
            .andExpect(model().attribute("vet", hasProperty("firstName", is("martin"))))
            .andExpect(model().attribute("vet", hasProperty("telephone", is("978823123"))))
            .andExpect(model().attribute("vet", hasProperty("horario", is("11:0"))))
            .andExpect(model().attribute("vet", hasProperty("hora_fin", is("12:0"))))
                .andExpect(model().attribute("vet", hasProperty("specialty")))
            .andExpect(view().name("vets/vetsDetails"));
    }
}
