package Lista01;

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // 23. Calculadora de Combustível: Crie um programa que leia a distância a ser percorrida,
        // o consumo médio do veículo (km/l) e o preço do combustível. Calcule e exiba o custo total da viagem.

        // Gasolina: 1l -> 12km

        System.out.print("Distância a percorrer? ");
        double distancia = sc.nextDouble();

        System.out.print("R$ 6.38 o litro -> Quantos litros quer abastecer? ");
        double qtdCombustivel = sc.nextDouble();
        double conta = qtdCombustivel*6.38;

        System.out.printf("Distância percorrida: %.2f km\n", distancia);
        System.out.printf("Preço do combustivel R$ %.2f\n", conta);
        System.out.printf("Consumo médio: %.2f km / litro", distancia/qtdCombustivel );

    }
}
