package com.ankur.architect.archservice.controller;

import com.ankur.architect.archservice.dto.CustomerDTO;
import com.ankur.architect.archservice.service.CustomerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ArchitectControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private CustomerService customerService;

    @Test
    public void saveCustomer() throws Exception {
        CustomerDTO dto = new CustomerDTO();
        dto.setFirstName("Ankur");
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(dto);
        Mockito.when(customerService.saveCustomer(Mockito.any(CustomerDTO.class))).thenReturn(dto);
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/customer")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .content(String.valueOf(json));
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        MockHttpServletResponse response = result.getResponse();
        assertEquals(HttpStatus.CREATED.value(), response.getStatus());
    }
}

