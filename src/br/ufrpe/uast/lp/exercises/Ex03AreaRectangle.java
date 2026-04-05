/* program that reads the base and height of a rectangle and displays its area.
Feito por: Laryssa Rodrigues
Turma: LP 2026.1
Data: 25/03/26
 */

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex03AreaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base of the rectangle: ");
        double base = sc.nextDouble();

        System.out.print("Height of the rectangle: ");
        double height = sc.nextDouble();

        System.out.printf("Area of the rectangle: %.1f", (base * height));

        sc.close();
    }
}
