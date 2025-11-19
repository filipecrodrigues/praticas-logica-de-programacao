import java.util.Locale;
import java.util.Scanner;

//Leia 5 números do usuário e calcule a soma total.
public class Somatorio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double soma = 0.0;
        for (int i = 1; i <= 5; i++) {

            System.out.print("Informe o "+i+" º número: ");
            double numero = scan.nextDouble();
            soma += numero; // soma = soma + numero;
        }
        System.out.print("Soma: "+soma);
    }
}