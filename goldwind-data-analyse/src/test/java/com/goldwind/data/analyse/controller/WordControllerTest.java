package com.goldwind.data.analyse.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Author: yuqing
 *
 * Create on: 19/12/2017
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class WordControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void whenGetWordCountFail() throws Exception {
        mockMvc.perform(get("/word/abc")).andExpect(status().is2xxSuccessful());
    }
}