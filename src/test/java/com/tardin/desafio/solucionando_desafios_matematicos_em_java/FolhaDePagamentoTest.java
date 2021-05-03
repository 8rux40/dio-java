package com.tardin.desafio.solucionando_desafios_matematicos_em_java;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FolhaDePagamentoTest {

    @Test
    public void testWithClosedInputs() {
        HashMap<FolhaDePagamento, Double> testCases = new HashMap<>(Map.of(
                new FolhaDePagamento(25, 100, 5.5), 550.0,
                new FolhaDePagamento(1, 200, 20.5), 4100.0,
                new FolhaDePagamento(6, 145, 15.55), 2254.75
        ));
        testCases.forEach((expectedInput, expectedResult) -> assertEquals(expectedResult, expectedInput.getSalary()));
    }
}
