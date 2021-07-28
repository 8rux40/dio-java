package com.tardin.desafio.primeiros_passos_em_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ARespostaDeTheon {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var availablePersons = new ArrayList<Integer>();
        var N = scanner.nextInt();
        for (int i = 0; i < N; i++)
            availablePersons.add(scanner.nextInt());
        System.out.println(getBestAvailablePersonIndexOf(availablePersons));
    }

    public static int getBestAvailablePersonIndexOf(List<Integer> availablePersons) {
        return availablePersons.indexOf(Collections.min(availablePersons)) + 1;
    }
}
