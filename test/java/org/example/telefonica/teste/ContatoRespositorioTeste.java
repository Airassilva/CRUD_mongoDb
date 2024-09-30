package org.example.telefonica.teste;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class ContatoRespositorioTeste {

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void testCadastrarTelefone() throws Exception {
        String telefoneJson = "{\"numero\": \"123456789\", \"nome\": \"Contato Teste\"}";

        mockMvc.perform(post("/telefones")
                        .contentType("application/json")
                        .content(telefoneJson))
                .andExpect(status().isCreated());

    }
}
