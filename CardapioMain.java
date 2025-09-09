import java.util.*;

public class CardapioMain {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Map<Integer, Cardapio> itens = new HashMap<>();
        itens.put(100, new Cardapio(100, "Cachorro Quente", 1.20));
        itens.put(101, new Cardapio(101, "Bauru Simples", 1.30));
        itens.put(102, new Cardapio(102, "Bauru com Ovo", 1.50));
        itens.put(103, new Cardapio(103, "Hambúrguer", 1.20));
        itens.put(104, new Cardapio(104, "Cheeseburguer", 1.30));
        itens.put(105, new Cardapio(105, "Refrigerante", 1.00));

        double totalGeral = 0.0;

        while (true) {
            System.out.print("Digite o código do item (0 para encerrar): ");
            int codigo = leia.nextInt();
            if (codigo == 0) break;

            if (!itens.containsKey(codigo)) {
                System.out.println("Código inválido!");
                continue;
            }

            System.out.print("Digite a quantidade: ");
            int qtd = leia.nextInt();

            Cardapio item = itens.get(codigo);
            double totalItem = item.calcularTotal(qtd);
            System.out.println(item.getDescricao() + " - R$ " + totalItem);
            totalGeral += totalItem;
        }

        System.out.println("Total geral: R$ " + totalGeral);
        leia.close();
    }
}
