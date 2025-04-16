package Lista01;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        // 3. Verificação de Número Positivo, Negativo ou Zero:
        // Crie um programa que receba um número inteiro do usuário e determine se ele é positivo, negativo ou zero.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num > 0){
            System.out.printf("O número %d é POSITIVO", num);
        }
        else if (num < 0){
            System.out.printf("O número %d é NEGATIVO", num);
        }
        else{
            System.out.printf("O número %d é ZERO", num);
        }
    }
}
