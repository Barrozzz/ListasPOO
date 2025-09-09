public class ContaBancaria {
    private int numero;
    private String nome;
    private double saldo;

    public ContaBancaria(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    public void deposito(double valor) {
        if (valor > 0) saldo += valor;
    }

    public void saque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void exibir() {
        System.out.println("Conta: " + numero);
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: R$ " + saldo);
    }
}
