package Lista01;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        // 2. Par ou Ímpar: Crie um programa que determine se um número inteiro é par ou ímpar.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num % 2 ==0){
            System.out.printf("O número %d é PAR", num);
        }
        else{
            System.out.printf("O número %d é IMPAR", num);
        }

    }
}
