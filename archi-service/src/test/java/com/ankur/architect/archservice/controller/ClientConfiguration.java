package com.ankur.architect.archservice.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class ClientConfiguration {
    static final String BASE_URL = "http://localhost:8080";

    static final String ORDERS_REL = "order";
    static final String CUSTOMERS_REL = "customer";
    static final String PRODUCTS_REL = "product";

    // TODO: actually needs .Customer prepended
    static final String ORDER_CUSTOMER_REL = "order.Order.customer";
    @Bean
    public RestOperations restOperations() {

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setObjectMapper(mapper);
        converter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON));

        List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
        converters.add(converter);

        RestTemplate template = new RestTemplate();
        template.setMessageConverters(converters);

        return template;
    }
}
