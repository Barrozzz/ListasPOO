import java.util.Scanner;

public class PessoaMain {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = leia.nextLine();
        System.out.print("Idade: ");
        int idade = leia.nextInt();
        System.out.print("Peso: ");
        double peso = leia.nextDouble();
        System.out.print("Altura: ");
        double altura = leia.nextDouble();

        Pessoa p = new Pessoa(nome, idade, peso, altura);

        p.envelhecer();
        p.engordar(2);
        p.emagrecer(1);
        p.exibir();

        leia.close();
    }
}
