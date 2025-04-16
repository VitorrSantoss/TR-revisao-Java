package Lista01;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 7. Verificação de Idade: Escreva um programa que determine se uma pessoa é maior ou menor de idade

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade > 18){
            System.out.println("Você é: MAIOR IDADE");
        }
        else{
            System.out.println("Você é: MENOR IDADE");
        }
    }
}
