public class Televisor {
    private int canal;
    private int volume;

    public Televisor(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }

    public void mudarCanal(int novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 999) {
            canal = novoCanal;
        } else {
            System.out.println("Canal inválido!");
        }
    }

    public void aumentarVolume() {
        if (volume < 100) volume++;
    }

    public void diminuirVolume() {
        if (volume > 0) volume--;
    }

    public void exibir() {
        System.out.println("Canal: " + canal + " | Volume: " + volume);
    }
}
