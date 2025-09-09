import java.util.Scanner;

public class SalarioMain {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? ");
        double valorHora = leia.nextDouble();

        System.out.print("Quantas horas trabalhou no mês? ");
        double horas = leia.nextDouble();

        Salario s = new Salario(valorHora, horas);
        System.out.println(s.toString());

        leia.close();
    }
}
