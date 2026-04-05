//program that reads a value in seconds and converts it to hours, minutes, and seconds.

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex12ConvertTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour, minute, second;

        System.out.print("Enter a value in seconds: ");
        int seconds = sc.nextInt();

        hour = seconds / 3600; //1h = 3600s
        minute = (seconds % 3600) / 60; //resto das horas dividido por 60
        second = (seconds % 3600) % 60; //segundos restantes

        System.out.printf("%d seconds is: %d hour(s), %d minute(s) and %d second(s).",
                seconds, hour, minute, second);

        sc.close();
    }
}
