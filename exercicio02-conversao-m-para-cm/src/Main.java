import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Informe os metros para conversão: ");

        String entrada = scan.next().replace(",","."); //.replace: Substitui todas as vírgulas (,) por pontos (.) na string lida.
        double numero = Double.parseDouble(entrada); //Converte a string entrada (que deve representar um número válido, como "3.14") em um valor do tipo double.
        //O valor numérico convertido é armazenado na variável numero.

        double resultado = numero * 100;

        System.out.printf(numero+" m  = %.2f cm", resultado);
    }
}