//shows a menu and performs operations until the user chooses to exit

package br.com.exercises;

import java.util.Scanner;

public class Ex20MathematicalOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option;

        do {
            System.out.println("""
                    === MATHEMATICAL OPERATIONS ===
                    [1] - SUM
                    [2] - SUBTRACTION
                    [3] - MULTIPLICATION
                    [4] - DIVISION
                    [5] - MODULE
                    [6] - POTENTIATION
                    [S] - EXIT""");
            System.out.print("Option: ");
            option = sc.nextLine();

            if (option.equalsIgnoreCase("S")) {
                System.out.println("Program ended...");
                break; //sai do loop
            }

            switch (option) {
                case "1", "2", "3", "4", "5", "6":
                    System.out.print("Enter a number: ");
                    double num1 = sc.nextDouble();

                    System.out.print("Enter a number: ");
                    double num2 = sc.nextDouble();

                    sc.nextLine(); //consome quebra de linha

                    double result = operacoes(num1, num2, option);
                    System.out.printf(">> Result: %.1f%n", result); //%n -> quebra de linha
                    break;

                default:
                    System.out.println("Invalid option! Choose 1 to 6.");
            }
        } while (true); //break dentro do if cuida da saida
    }

    public static double operacoes(double num1, double num2, String option) { //double: executa e devolve valor
        return switch (option) { //return garante que tudo dentro do switch vai retornar
            case "1" -> (num1 + num2);
            case "2" -> (num1 - num2);
            case "3" -> (num1 * num2); //retorna pra main
            case "4" -> (num1 / num2); //->: "retorna"; substitui o ':' e o break
            case "5" -> (num1 % num2);
            case "6" -> Math.pow(num1, num2); //metodo estatico -> Math.pow(base, expoente), double
            default -> 0; //opçao invalida
        };
    }
}
