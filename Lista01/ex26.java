package Lista01;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {

        // 26. Idades: Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova,
        // e o produto das idades do homem mais novo com a mulher mais velha.

        Scanner sc = new Scanner(System.in);

        // Entrada das idades dos homens
        System.out.print("1º Homem: ");
        int h1 = sc.nextInt();
        System.out.print("2º Homem: ");
        int h2 = sc.nextInt();

        // Entrada das idades das mulheres
        System.out.print("1ª Mulher: ");
        int m1 = sc.nextInt();
        System.out.print("2ª Mulher: ");
        int m2 = sc.nextInt();

        // Determinar Homem mais velho e mais novo
        int homemMaisVelho = Math.max(h1, h2);
        int homemMaisNovo = Math.min(h1,h2);

        // Determinar Mulher mais velha e mais nova
        int mulherMaisVelha = Math.max(m1, m2);
        int mulherMaisNova =Math.min(m1, m2);

        // Calcular Resultados
        int soma = homemMaisVelho + mulherMaisNova;
        int multiplicacao = homemMaisNovo * mulherMaisVelha;

        // Exibir Resultados
        System.out.println("Soma: (Homem mais velho + Mulher mais nova): " + soma);
        System.out.println("Multiplicação: (Homem mais novo * Mulher mais velha): " + multiplicacao);
    }
}
