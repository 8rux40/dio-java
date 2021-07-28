package com.tardin.desafio.primeiros_passos_em_java;

import com.tardin.converter.StringArrayConverter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ARespostaDeTheonTest {
    @DisplayName("Valida o valor retornado é o mínimo valor possível dentre os fornecidos")
    @ParameterizedTest
    @CsvSource(value = {"2;'8,0,7'", "1;'1,1'", "4;'9,6,8,3'"}, delimiter = ';')
    public void shouldResultMinimumValueWhenInputsAreValid(
            int personIndex,
            @ConvertWith(StringArrayConverter.class) String[] strAvailablePersons
    ) {
        var availablePersons = new ArrayList<Integer>();
        for (String strPerson : strAvailablePersons) availablePersons.add(Integer.parseInt(strPerson));
        assertEquals(personIndex, ARespostaDeTheon.getBestAvailablePersonIndexOf(availablePersons));
    }
}
