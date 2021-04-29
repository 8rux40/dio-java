package com.tardin.desafios.solucionando_desafios_matematicos_em_java;

import com.tardin.desafio.solucionando_desafios_matematicos_em_java.CalculoDeViagem;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

public class CalculoDeViagemTest {
    @Test
    public void testWithClosedTestsInputs() {
        final HashMap<Integer[], Double> testCases = new HashMap<>(
                Map.of(new Integer[]{10, 85}, 70.833, new Integer[]{22, 67}, 122.833)
        );
        testCases.forEach((expectedInputs, expectedResult) -> assertEquals(
                String.format("%.3f", expectedResult),
                String.format("%.3f", CalculoDeViagem
                        .getNecessaryLiterAmoutForTheTrip(expectedInputs[0], expectedInputs[1]))
        ));
    }
}
