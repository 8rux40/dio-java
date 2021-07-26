package com.tardin.desafio.primeiros_passos_em_java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DomingoDeManhaTest {

    @DisplayName("Valida se o atraso máximo corresponde aos valores corretos quando as entradas são válidas")
    @ParameterizedTest
    @CsvSource({ "7,10,10", "5,0,0" })
    public void shouldResultCorrectMaximumDelayWhenInputsAreValid(int hours, int minutes, int maximumDelayInMinutes){
        assertEquals(maximumDelayInMinutes, DomingoDeManha.getMaximumDelay(hours, minutes));
    }
}
