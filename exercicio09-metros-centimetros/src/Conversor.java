import java.util.Locale;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Informe a metros a serem convertidos: ");
        double metros = scan.nextDouble();

        double centimetros = converterMetrosParaCentimetros(metros);

        System.out.printf("%.2f metros equivalem a: %.2f centímetros%n", metros, centimetros);


        scan.close();

        }

        /*Função para converter metros para centimetros*/
        public static double converterMetrosParaCentimetros (double metros){
            return  metros *100;
        }
    }
