package com.rodrigoziviani.rankcomplete.status;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.http.HttpStatus.OK;

class StatusControllerTest {

    @Test
    void shouldReturnStatusOk() {
        StatusController controller = new StatusController();
        ResponseEntity<String> response = controller.status();
        assertThat(response.getStatusCode()).isEqualTo(OK);
        assertThat(response.getBody()).isEqualTo("RankComplete running OK");
    }
}
