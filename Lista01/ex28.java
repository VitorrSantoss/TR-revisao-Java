package Lista01;

import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {

        // 28. Preço da compra:
        // Se quantidade <= 5 o desconto será de 2%
        // Se quantidade > 5 e quantidade <=10 o desconto será de 3%
        // Se quantidade > 10 o desconto será de 5%

        Scanner sc = new Scanner(System.in);

        System.out.print("Produto: ");
        String nome = sc.nextLine();

        System.out.print("Quantidae Adquirida: ");
        int qtdAdquirida = sc.nextInt();

        System.out.print("Preço Unitário: ");
        double precoUnitario = sc.nextDouble();

        double total = qtdAdquirida * precoUnitario;
        double desconto=0;

        System.out.println("Preço sem desconto: " + total);

        if (qtdAdquirida <=5){
            System.out.println("DESCONTO -> 2%");
            desconto = total * 0.02;
            double totPagar = total - desconto;
            System.out.println(totPagar);
        }
        else if (qtdAdquirida <=10){
            System.out.println("DESCONTO -> 3%");
            desconto = total * 0.03;
            double totPagar = total - desconto;
            System.out.println(totPagar);
        }
        else {
            System.out.println("DESCONTO -> 5%");
            desconto = total * 0.05;
            double totPagar = total - desconto;
            System.out.println(totPagar);
        }
    }
}
