package com.rodrigoziviani.rankcomplete.status;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.http.HttpStatus.OK;

class StatusControllerTest {

    private static final ResponseEntity<Void> OK_RESPONSE = new ResponseEntity<>(OK);

    @Test
    void shouldReturnStatusOk() {
        StatusController controller = new StatusController();
        assertThat(controller.status()).isEqualTo(OK_RESPONSE);
    }
}
