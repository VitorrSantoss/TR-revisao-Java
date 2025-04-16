package Lista01;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // E-mail válido: Escreva um programa que valide um endereço de e-mail (de forma simples, verificando se contém '@' e '.').

        System.out.print("Email: ");
        String email = sc.nextLine();

        if(email.contains("@") && email.contains(".")){
            System.out.println("Email Válido!");
        }
        else {
            System.out.println("Email inválido");
        }
    }
}
