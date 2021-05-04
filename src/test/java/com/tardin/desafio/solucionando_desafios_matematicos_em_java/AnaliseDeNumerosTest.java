package com.tardin.desafio.solucionando_desafios_matematicos_em_java;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnaliseDeNumerosTest {
    @Test
    public void testWithClosedInputs() {
        HashMap<AnaliseDeNumeros, List<Integer>> testCases = new HashMap<>(Map.of(
                new AnaliseDeNumeros(List.of(-5, 0, -3, -4, 12)),   List.of(3, 2, 1, 3),
                new AnaliseDeNumeros(List.of(0, 0, 0, 0, 0)),       List.of(5, 0, 0, 0),
                new AnaliseDeNumeros(List.of(-9, 1, -84, 27, -1)),  List.of(1, 4, 2, 3),
                new AnaliseDeNumeros(List.of(60, -60, 0, -30, 30)), List.of(5, 0, 2, 2)
        ));
        testCases.forEach((expectedInput, expectedResult) -> assertEquals(expectedResult, List.of(
                expectedInput.getPairs(),
                expectedInput.getOdd(),
                expectedInput.getPositives(),
                expectedInput.getNegatives()
        )));
    }
}
