package com.nbs.Testes.TestesUnits;

import com.nbs.Testes.TestesUnits.controller.TestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnitController {


    @Test
    public void testUnit(){
        TestController controller = new TestController();
        String resultado = controller.saudacao("João");
        assertEquals("Bem vindo João",resultado);

    }
}
