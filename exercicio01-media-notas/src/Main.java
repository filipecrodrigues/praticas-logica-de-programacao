import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que as peça 4 notas bimestrais e mostre a média
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

     double media = 0;

     for (int i = 1; i < 5; i++ ){

         System.out.print("Informe o " + i + "º: ");
         String entrada = scan.next().replace(",",".");
         double numero = Double.parseDouble(entrada);

         media +=numero;

        }

        double resultado = media /4;

        System.out.printf("Media = %.2f%n", resultado);

    }
}