package com.tardin.desafio.solucionando_desafios_matematicos_em_java;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplosTest {
    @Test
    public void testWithClosedInputs(){
        HashMap<Multiplos, Boolean> testCases = new HashMap<>(Map.of(
                new Multiplos(6, 24), true,
                new Multiplos(6, 25), false,
                new Multiplos(12, 48), true,
                new Multiplos(48, 12), true
        ));
        testCases.forEach((expectedInput, expectedResult) -> assertEquals(expectedResult, expectedInput.areMultiple()));
    }
}
