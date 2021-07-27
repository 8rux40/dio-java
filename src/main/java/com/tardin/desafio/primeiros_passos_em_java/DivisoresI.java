package com.tardin.desafio.primeiros_passos_em_java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisoresI {
    public static void main(String[] args) throws IOException {
        for (Integer divider : getDividersOf(new Scanner(System.in).nextInt()))
            System.out.println(divider);
    }

    public static List<Integer> getDividersOf(int number) {
        var dividers = new ArrayList<Integer>();
        for (int i = 1; i <= number; i++)
            if (number % i == 0) dividers.add(i);
        return dividers;
    }
}
