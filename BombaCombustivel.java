public class BombaCombustivel {
    private String tipo;
    private double valorLitro;
    private double quantidade;

    public BombaCombustivel(String tipo, double valorLitro, double quantidade) {
        this.tipo = tipo;
        this.valorLitro = valorLitro;
        this.quantidade = quantidade;
    }

    public void abastecerPorValor(double valor) {
        double litros = valor / valorLitro;
        if (litros <= quantidade) {
            quantidade -= litros;
            System.out.println("Foram abastecidos " + litros + " litros.");
        } else {
            System.out.println("Combustível insuficiente!");
        }
    }

    public void abastecerPorLitro(double litros) {
        if (litros <= quantidade) {
            double valor = litros * valorLitro;
            quantidade -= litros;
            System.out.println("Valor a pagar: R$ " + valor);
        } else {
            System.out.println("Combustível insuficiente!");
        }
    }

    public void alterarValor(double novoValor) {
        valorLitro = novoValor;
    }

    public void alterarTipo(String novoTipo) {
        tipo = novoTipo;
    }

    public void alterarQuantidade(double novaQtd) {
        quantidade = novaQtd;
    }

    public void exibir() {
        System.out.println("Tipo: " + tipo + " | Preço: R$ " + valorLitro + " | Qtd: " + quantidade + "L");
    }
}
