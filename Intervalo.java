public class Intervalo {
    private int inicio;
    private int fim;

    public Intervalo(int inicio, int fim) {
        if (inicio > fim) {
            int aux = inicio;
            inicio = fim;
            fim = aux;
        }
        this.inicio = inicio;
        this.fim = fim;
    }

    public int getInicio() { return inicio; }
    public void setInicio(int inicio) { this.inicio = inicio; }

    public int getFim() { return fim; }
    public void setFim(int fim) { this.fim = fim; }

    public String toString() {
        String numeros = "";
        for (int i = inicio; i <= fim; i++) {
            numeros += i + " ";
        }
        return "Intervalo: " + numeros;
    }
}
