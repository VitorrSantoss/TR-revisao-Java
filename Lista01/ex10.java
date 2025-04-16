package Lista01;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 10. Conversão de Segundos: Escreva um programa que converta um número de segundos em horas, minutos e segundos

        System.out.println("Digite quantos segundos você quer converter? ");
        System.out.print("Segundos: ");
        int totsegundos = sc.nextInt();

        int horas = totsegundos / 3600;
        int minutos = (totsegundos%3600)/60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);

    }
}
