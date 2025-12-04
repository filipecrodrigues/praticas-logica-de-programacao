import java.util.Scanner;

//Tendo como dados de entrada a altura de uma pessoa calcule seu peso ideal formula
// homens (72.7 * altura) - 58
//mulheres(62.1 *altura) - 44.7
public class PesoIdeal {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Informe sua altura: ");
        String entrada = scanner.nextLine();
        entrada = entrada.replace(",", ".");
        double altura = Double.parseDouble(entrada);

        double pesoIdealM = calcularPesoM(altura);
        double pesoIdealF = calcularPesoF(altura);

        System.out.printf("Peso Ideal para Homens: %.1f kg%n", pesoIdealM);
        System.out.printf("Peso Ideal para Mulheres: %.1f kg%n", pesoIdealF);

    }
    //calcular peso masculino
    public static double calcularPesoM(double altura){
        return (72.7 * altura) -58;
    }

    //calcular peso feminino
    public static double calcularPesoF(double altura){
        return (62.1 * altura) - 44.7;
    }
}
