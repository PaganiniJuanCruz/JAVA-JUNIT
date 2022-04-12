package com.junit.junit.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc

public class PupilServiceTest {
    @Autowired
    private MockMvc mock;

    @MockBean
    private PupilService pupilService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void nameComplete() throws Exception {

        String name = "Pochi";
        String surname = "Paganini";
        String complete = pupilService.nameComplete(name, surname);
        System.out.println(complete);
        assertEquals("Pochi Paganini", complete);
        this.mock.perform(get("/")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString(complete)));
    }
}
