package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex27WordSplitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a line: ");
        String line = sc.nextLine().trim();
        String[] words = line.split("\\s+");
        // \\s+ -> representa espaço em branco | + -> "um ou mais" | ou seja, tira espaços desnecessarios entre palavras
        //.trim() -: remove espaços extras antes ou no fim da frase
        //.split() -> devolve um array (vetor) onde cada posiçao é uma palavra da frase

        System.out.println("Total words: " + words.length); //imprime total palavras
        //String: .length(); Array: .length

        System.out.println("Words separated by ';': " + String.join("; ", words)); //imprime palavras separadas com ";"
        //.join(delimitador, elemento1) -> concatena ele;mentos (String, listas ou arrays) com um delimitador

        sc.close();
    }
}
