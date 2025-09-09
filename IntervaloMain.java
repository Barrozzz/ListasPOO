import java.util.Scanner;

public class IntervaloMain {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = leia.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = leia.nextInt();

        Intervalo intervalo = new Intervalo(n1, n2);
        System.out.println(intervalo.toString());

        leia.close();
    }
}
