package com.tardin.desafio.iniciando_programacao_em_java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.HashMap;
import java.util.Map;

public class EntradaESaidaCPFTest {
    @Test
    public void testWithClosedTestsInputs() {
        HashMap<String, String[]> testCases = new HashMap<>(
                Map.of("000.000.000-00", new String[]{"000", "000", "000", "00"},
                        "320.025.102-01", new String[]{"320", "025", "102", "01"})
        );
        testCases.forEach((expectedInput, expectedResult) ->
                assertArrayEquals(expectedResult, EntradaESaidaCPF.getCPFInSeparatedStrings(expectedInput)));
    }
}
