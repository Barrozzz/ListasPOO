import java.util.Scanner;

public class ContaBancariaMain {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria(123, "João", 1000);

        conta.exibir();

        System.out.print("Depositar valor: ");
        double dep = leia.nextDouble();
        conta.deposito(dep);

        System.out.print("Sacar valor: ");
        double saq = leia.nextDouble();
        conta.saque(saq);

        System.out.print("Novo nome do titular: ");
        leia.nextLine(); // limpar buffer
        String nome = leia.nextLine();
        conta.alterarNome(nome);

        conta.exibir();

        leia.close();
    }
}
