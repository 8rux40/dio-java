package com.tardin.desafio.primeiros_passos_em_java;

import com.tardin.converter.StringArrayConverter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisoresITest {

    @DisplayName("Valida se os divisores correspondem aos valores corretos quando as entradas são válidas")
    @ParameterizedTest
    @CsvSource(value = {"6;'1,2,3,6'", "10;'1,2,5,10'", "13;'1,13'", "1;'1'", "99;'1,3,9,11,33,99'"}, delimiter = ';')
    public void shouldResultCorrectDividersWhenInputsAreValid(
            int number,
            @ConvertWith(StringArrayConverter.class) String[] strDividers
    ) {
        var dividers = new ArrayList<Integer>();
        for (String strDivider : strDividers) dividers.add(Integer.parseInt(strDivider));
        assertEquals(dividers, DivisoresI.getDividersOf(number));
    }
}
