package Lista01;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Lista de idades: Calcule e imprima a idade média deste grupo de indivíduos.

        int soma=0;
        int cont=0;

        while(true){
            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();
            if (idade ==0){
                break;
            }

            soma = soma+idade;
            System.out.println(soma);
            cont = cont + 1;
            System.out.println(cont);
        }
        System.out.print("Média das idades: " + soma/cont);
    }
}
