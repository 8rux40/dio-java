package com.tardin.desafio.solucionando_problemas_basicos_em_java;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicacaoSimplesTest {
    @Test
    public void testWithClosedInputs() {
        HashMap<Integer[], Integer> testCases = new HashMap<>(Map.of(
                new Integer[]{3, 9}, 27,
                new Integer[]{-30, 10}, -300,
                new Integer[]{0, 9}, 0
        ));
        testCases.forEach((expectedInput, expectedResult) -> assertEquals(
                expectedResult, MultiplicacaoSimples.multiply(expectedInput[0], expectedInput[1])
        ));
    }
}
