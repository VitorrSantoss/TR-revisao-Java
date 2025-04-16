package Lista01;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        // 1ª) Cálculo da Média: Escreva um programa que calcule a média de três números.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o 2º número: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o 3º Número: ");
        int num3 = sc.nextInt();

        System.out.println("Média: " + (num1+num2+num3)/3);

    }
}
