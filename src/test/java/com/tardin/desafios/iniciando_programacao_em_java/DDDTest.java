package com.tardin.desafios.iniciando_programacao_em_java;

import com.tardin.desafio.iniciando_programacao_em_java.DDD;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DDDTest {
    @Test
    public void testEachValidDDD() {
        HashMap<Integer, String> testCases = new HashMap<>(
                Map.of(21, "Rio de Janeiro",
                        11, "Sao Paulo",
                        31, "Belo Horizonte",
                        27, "Vitoria",
                        13, "DDD nao cadastrado")
        );
        testCases.forEach((expectedInput, expectedOutput) ->
                assertEquals(expectedOutput, DDD.getCorrespondingCityName(expectedInput)));
    }
}
