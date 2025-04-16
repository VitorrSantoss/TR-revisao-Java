package Lista01;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {


        // 19. Cálculo de pares: Calcule a soma dos números pares de 100 até 200

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int soma= 0;

        for(int i = n; i<=200; i++){
            if (i%2==0){
                soma+=i;
            }
        }
        System.out.println("Soma dos números Pares: " + soma);

    }
}
