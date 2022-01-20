package com.testeunitario.Testte;

import com.testeunitario.Testte.controller.TestController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnitController {
    @Test
    public void testUnit(){
        TestController controller = new TestController();
        String resultado = controller.saudacao("João");
        assertEquals("Bem vind, João",resultado);

    }
}
