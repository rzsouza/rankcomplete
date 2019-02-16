package com.rodrigoziviani.rankcomplete.status;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

class StatusControllerWebIT {

    @Test
    void shouldReturnOkStatus() throws Exception {
        StatusController statusController = new StatusController();
        MockMvc mockMvc = standaloneSetup(statusController).build();

        mockMvc.perform(get("/status"))
               .andExpect(status().isOk())
               .andExpect(content().string("RankComplete running OK"));
    }
}
