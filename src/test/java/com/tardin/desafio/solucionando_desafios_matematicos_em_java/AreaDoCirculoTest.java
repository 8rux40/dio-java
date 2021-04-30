package com.tardin.desafio.solucionando_desafios_matematicos_em_java;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaDoCirculoTest {
    @Test
    public void testWithClosedInputs() {
        HashMap<Double, Double> testCases = new HashMap<>(Map.of(
                2.00, 12.5664,
                100.64, 31819.3103,
                150.00, 70685.7750
        ));
        testCases.forEach((expectedInput, expectedResult) -> assertEquals(
                String.format("A=%.4f", expectedResult),
                String.format("A=%.4f", AreaDoCirculo.getCircleArea(expectedInput))
        ));
    }
}
