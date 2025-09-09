import java.util.Scanner;

public class TelevisorMain {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Televisor tv = new Televisor(5, 20);
        tv.exibir();

        System.out.print("Novo canal: ");
        int canal = leia.nextInt();
        tv.mudarCanal(canal);

        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.exibir();

        leia.close();
    }
}
