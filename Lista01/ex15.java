package Lista01;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Contagem de Vogais: Conte o número de vogais em uma string.

        System.out.print("Digite algo: ");
        String texto = sc.nextLine().toLowerCase();

        int contador = 0;

        for(int i = 0; i<texto.length(); i++){
            char caracter = texto.charAt(i);

            if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                contador++;
            }
        }
        System.out.println("Qtd Vogais: " + contador);
        sc.close();
    }
}
