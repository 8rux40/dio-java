package com.tardin.desafio.desafios_java_developer;

import java.util.Scanner;

public class FusoHorario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int departureTime = scanner.nextInt();
        int travelTime = scanner.nextInt();
        int timezone = scanner.nextInt();

        int arrivalTime = calculateArrivalTime(departureTime, travelTime, timezone);

        System.out.println(arrivalTime);
        scanner.close();
    }

    public static int calculateArrivalTime(int departureTime, int travelTime, int timezone){
        int time = departureTime + travelTime + timezone;
        return time >= 24 ? time - 24 : time;
    }
}
