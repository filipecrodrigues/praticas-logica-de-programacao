import java.util.Scanner;

//Faça um programa que peça ao usuario a temperatura em Fahrenheit e converta para Celcius
public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a temperatura em Fahrenheit para a conversão: ");
        String entrada = scan.nextLine();
        entrada = entrada.replace(",", ".");
        double fahrenheit = Double.parseDouble(entrada);
        double celcius = 5.0/9 *(fahrenheit-32);

        System.out.printf("Temperatura em Celcius: %.2f%n",celcius);

        scan.close();
    }
}
