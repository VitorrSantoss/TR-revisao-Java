package Lista01;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 8. Cálculo do IMC: Crie um programa que calcule o Índice de Massa Corporal (IMC) de uma pessoa.

        System.out.print("Informe seu PESO (kg): ");
        double peso = sc.nextInt();
        System.out.print("Informe sua ALTURA (m): ");
        double altura = sc.nextDouble();

        System.out.printf("IMC: %.1f", peso/Math.pow(altura,2));

    }
}
