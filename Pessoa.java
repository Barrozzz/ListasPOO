public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer() {
        idade++;
        if (idade < 21) {
            altura += 0.5;
        }
    }

    public void engordar(double kilos) {
        peso += kilos;
    }

    public void emagrecer(double kilos) {
        peso -= kilos;
    }

    public void crescer(double cm) {
        altura += cm;
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }
}
