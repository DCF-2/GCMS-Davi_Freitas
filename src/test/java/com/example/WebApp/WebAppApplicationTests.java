package com.example.WebApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class WebAppApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    @SuppressWarnings("null")
    
    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/"))

                .andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("Hello, World!")));

    }

    @SuppressWarnings("null")
 
    @Test
    public void shouldReturnDefaultMessageDavi() throws Exception {
        this.mockMvc.perform(get("/Davi"))

                .andDo(print()).andExpect(status().isOk())
                .andExpect(content()
                        .string(containsString("Hello, Davi! Say hello Davi")));

    }

    @SuppressWarnings("null")
    
    @Test
    public void shouldReturnDefaultMessageHugo() throws Exception {
        this.mockMvc.perform(get("/Hugo"))

                .andDo(print()).andExpect(status().isOk())
                .andExpect(content()
                        .string(containsString("Hugos is my brother ! Say hello Hugo")));

    }

    @SuppressWarnings("null")
    @Test
    public void shouldReturnDefaultMessageHotfix() throws Exception {
        this.mockMvc.perform(get("/hotfix"))

                .andDo(print()).andExpect(status().isOk())
                .andExpect(content()
                        .string(containsString("Hello, hotfix!")));

    }

    @SuppressWarnings("null")
    @Test
    public void shouldReturnDefaultMessageTeste() throws Exception {
        this.mockMvc.perform(get("/teste"))

                .andDo(print()).andExpect(status().isOk())
                .andExpect(content()
                        .string(containsString("Hello, testes_container!")));

    }
}