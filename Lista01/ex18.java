package Lista01;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {

        // 18. Cálculo de Desconto Progressivo:
        // Compras de R$ 100,00 a R$ 200,00: 5% de desconto.
        // Compras de R$ 200,01 a R$ 300,00: 10% de desconto.
        // Compras acima de R$ 300,00: 15% de desconto.

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da Compra: R$ ");
        double valor = sc.nextDouble();

        if (valor >= 100 && valor <= 200){
            System.out.printf("Desconto a ser aplicado: 5%%\nValor a ser pago: R$ %.2f", (valor - valor*0.05));
        }
        else if (valor >= 200.01 && valor <=300){
            System.out.printf("Desconto a ser aplicado: 10%%\nValor a ser pago: R$ %.2f", (valor - valor*0.10));
        }
        else if (valor > 300){
            System.out.printf("Desconto a ser aplicado: 15%%\nValor a ser pago: R$ %.2f", (valor - valor*0.15));

        }
    }
}
