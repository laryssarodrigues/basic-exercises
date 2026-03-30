package br.com.exercises;

import java.util.Scanner;

public class Ex37StudentNameSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] studentName = new String[5]; //array de Str para armazenar 5 nomes

        for (int i = 0; i < 5; i++) { //laço para guardar o nome dos estudantes no array studentName na posiçao i
            System.out.print("Type the student's name: ");
            String name = sc.nextLine();
            studentName[i] = name;
        }

        System.out.print(">> Search name: ");
        String searchName = sc.nextLine().trim();

        boolean foundList = false; //assume que nao existe na lista
        int j = 0;
        while (j < studentName.length) { //enquanto nao chegar no fim do array
            if (studentName[j].equalsIgnoreCase(searchName)) { //compara ignorando caixas
                foundList = true;
                break; //como foi encontrado, para o loop
            }
            j++; //vai para o proximo elemento
        }

        if (foundList) {
            System.out.println("Exists in the list!");
        } else {
            System.out.println("Does not exist in the list!");
        }

        sc.close();
    }
}
