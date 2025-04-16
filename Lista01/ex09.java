package Lista01;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {

        // 9. Soma dos Dígitos: Faça um programa que calcule a soma dos dígitos de um número inteiro.
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int primerioDigito = num%10;

        System.out.println("Segundo Dígito: "+ primerioDigito);

        System.out.println("Primeiro Digito: " + num/10);

        System.out.println("Soma dos dígitos: " + (primerioDigito + num/10));



    }
}