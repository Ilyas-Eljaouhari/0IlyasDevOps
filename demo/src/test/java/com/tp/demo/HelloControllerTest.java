package com.tp.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    @Test
    void testHello() {
        HelloController controller = new HelloController();

        String result = controller.hello();

        assertEquals("Hello DevOps!", result);
    }
}