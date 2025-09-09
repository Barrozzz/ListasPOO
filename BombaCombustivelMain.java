import java.util.Scanner;

public class BombaCombustivelMain {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.50, 1000);
        bomba.exibir();

        System.out.print("Valor para abastecer: ");
        double valor = leia.nextDouble();
        bomba.abastecerPorValor(valor);

        System.out.print("Litros para abastecer: ");
        double litros = leia.nextDouble();
        bomba.abastecerPorLitro(litros);

        System.out.print("Novo preço por litro: ");
        double preco = leia.nextDouble();
        bomba.alterarValor(preco);

        System.out.print("Novo tipo de combustível: ");
        leia.nextLine();
        String tipo = leia.nextLine();
        bomba.alterarTipo(tipo);

        System.out.print("Nova quantidade na bomba: ");
        double qtd = leia.nextDouble();
        bomba.alterarQuantidade(qtd);

        bomba.exibir();

        leia.close();
    }
}
