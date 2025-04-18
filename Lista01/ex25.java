package Lista01;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // 25. Cálculo de hora extra:

        System.out.print("Salário: ");
        double salario = sc.nextDouble();

        System.out.print("Salário/Hora: ");
        double salHora = sc.nextDouble();

        System.out.print("Horas Trabalhadas: ");
        int horasTrab = sc.nextInt();

        if(horasTrab > 160){
            salHora = salHora * 0.5;
            System.out.println("Você possui horas extras!");
            System.out.printf("Valor da hora extra: R$ %s\n", salHora);
            System.out.printf("Salário a receber: R$ %s", salario + salHora);
        }
        else{
            System.out.println("Você não possui horas extras");
        }
    }
}
