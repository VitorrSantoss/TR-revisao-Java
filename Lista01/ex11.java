package Lista01;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {


        // 11. Fatorial: Calcule o fatorial de um número inteiro.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número e veja o fatorial: ");
        int fatorial = sc.nextInt();
        int entrada = 1;

        for(int i = 1; i<= fatorial; i++){
            entrada *=i;

        }

        System.out.println("Fatorial de "+ fatorial + " = " + entrada);
    }
}
