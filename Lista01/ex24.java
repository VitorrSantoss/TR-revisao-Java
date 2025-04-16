package Lista01;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 24. Calculadora: Crie um programa que implemente uma simples calculadora com as operações básicas.

        System.out.print("Número: ");
        double num1 = sc.nextDouble();

        System.out.print("Número: ");
        double num2 = sc.nextDouble();

        while (true){
            System.out.println("Escolha a operação matemática");
            System.out.println("[1] Soma\n[2] Subtrair\n[3] Multiplicar\n[4] Dividir\n[5] Digitar novos valores\n[0] Encerrar");
            int decisao = sc.nextInt();

            if (decisao == 1){
                System.out.printf("Soma: %.1f\n", (num1 + num2));
            }
            else if (decisao == 2) {
                System.out.printf("Subtração: %.1f\n", (num1 - num2));
            }
            else if (decisao == 3){
                System.out.printf("Multiplicação: %.1f\n", (num1 * num2));
            }
            else if (decisao == 4){
                System.out.printf("Divisão: %.1f\n", (num1 / num2));
            }
            else if (decisao ==5){
                System.out.print("Número: ");
                double num3 = sc.nextDouble();

                System.out.print("Número: ");
                double num4 = sc.nextDouble();
            }
            else if (decisao == 0){
                break;
            }

        }



    }
}
