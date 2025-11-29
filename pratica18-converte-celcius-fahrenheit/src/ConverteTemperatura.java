import java.util.Scanner;

//Agora o inverso da questão anterior peça o usuario a
// temperatura em celcios e converta para fahrenheit
public class ConverteTemperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a temperatura em Celcius para conversão: ");
        String entrada = scan.nextLine();
        entrada = entrada.replace(",", ".");
        double celcius = Double.parseDouble(entrada);

        double fahrenheit = celcius * 1.8 + 32;

        System.out.printf("A temperatura em Fahreneheit: %.1f%n",fahrenheit);

    }
}
