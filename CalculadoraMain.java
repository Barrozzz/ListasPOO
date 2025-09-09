import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = leia.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = leia.nextDouble();

        Calculadora c = new Calculadora(n1, n2);
        System.out.println(c.toString());

        leia.close();
    }
}
