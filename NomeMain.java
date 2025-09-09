import java.util.Scanner;

public class NomeMain {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = leia.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = leia.nextLine();

        Nome n = new Nome(nome, sobrenome);
        System.out.println(n.toString());

        leia.close();
    }
}
