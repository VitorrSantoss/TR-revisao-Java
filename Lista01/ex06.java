package Lista01;

import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 6. Raiz Quadrada: Faça um programa que calcule a raiz quadrada de um número inteiro

        System.out.println("Digite um número!");
        System.out.print("A raiz quadrada de: ");
        int num = sc.nextInt();
        System.out.printf("Raiz Quadrada: %s", Math.sqrt(num));
    }
}