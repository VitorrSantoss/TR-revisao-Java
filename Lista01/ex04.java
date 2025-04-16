package Lista01;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {


        // 4. Maior Número: Escreva um programa que encontre o maior entre dois números inteiros.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o 2º número: ");
        int num2 = sc.nextInt();

        // 1ª proposta de resolução!
        System.out.printf("O maior número é %d", Math.max(num1, num2));

        // 2ª proposta de resolução
        if (num1 > num2){
            System.out.printf("O maior número é %d", num1);
        }
        else{
            System.out.printf("O maior número é %d", num2);
        }
    }
}
