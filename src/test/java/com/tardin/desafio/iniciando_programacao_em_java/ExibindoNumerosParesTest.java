package com.tardin.desafio.iniciando_programacao_em_java;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExibindoNumerosParesTest {
    @Test
    public void testIfMethodReturnsPositivePairsUntilNumber() {
        final int randomNumber = (new Random()).nextInt(100) + 1;
        List<String> expectedPairNumbers = intStreamToListString(
                IntStream.rangeClosed(1, randomNumber).filter(number -> number % 2 == 0));
        List<String> actualPairNumbers = intStreamToListString(
                ExibindoNumerosPares.getPositivePairsUntilNumber(randomNumber));
        assertEquals(expectedPairNumbers, actualPairNumbers);
    }

    @Test
    public void testWithClosedTestsInputs() {
        HashMap<Integer, List<String>> testCases = new HashMap<>(
                Map.of(
                        6, List.of("2", "4", "6"),
                        13, List.of("2", "4", "6", "8", "10", "12"),
                        1, List.of()
                )
        );
        testCases.forEach((expectedNumber, expectedResults) -> assertEquals(expectedResults,
                intStreamToListString(ExibindoNumerosPares.getPositivePairsUntilNumber(expectedNumber))));
    }

    private List<String> intStreamToListString(IntStream stream) {
        return stream.boxed()
                .map(Object::toString)
                .collect(Collectors.toList());
    }
}