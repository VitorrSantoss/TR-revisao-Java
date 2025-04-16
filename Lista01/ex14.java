package Lista01;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {

        // 14. Verificação de Palíndromo: Determine se uma string é um palíndromo.

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        String num = sc.nextLine();

        String invertida = new StringBuilder(num).reverse().toString();

        if (num.equals(invertida)){
            System.out.println("É um PALÍNDROMO");
        }
        else{
            System.out.println("Não é um PALÍNDROMO");
        }
    }
}
