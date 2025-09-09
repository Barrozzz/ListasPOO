import java.util.Scanner;

public class QuadradoMain {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        double lado = leia.nextDouble();

        Quadrado q = new Quadrado(lado);

        System.out.println("Lado: " + q.getLado());
        System.out.println("Área: " + q.calcularArea());

        leia.close();
    }
}
