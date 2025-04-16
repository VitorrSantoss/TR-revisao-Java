package Lista01;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {


        // 17. Sequência de Collatz; Se n for PAR, divida por 2, se n for ÍMPAR multiplique por (3) + 1
        // até o resultado  ser == 1

        Scanner sc = new Scanner(System.in);

        System.out.print("Digita um número: ");
        int n = sc.nextInt();

        if (n>0){
            while (true){
                if (n%2==0){
                    n = n/2;
                    System.out.println(n);
                }
                else{
                    n = (n*3)+1;
                    System.out.println(n);
                }
                if (n==1){
                    break;
                }
            }
        }
        else{
            System.out.println("O número deve ser maior que 0\nTente Novamente!");
        }
    }
}
