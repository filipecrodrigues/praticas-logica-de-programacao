import java.util.Scanner;

//Faça um programa que calcule a
// area do quadrado, em seguida mostre o dobro desta área para o usuario
public class CalculoQuadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a medida de um dos lados do quadrado: ");

        //Lê a entrada como string para aceitar virgula e ponto
        String entrada = scan.nextLine();

        //subistitui virgula por ponto caso o usuário digite virgula
        entrada = entrada.replace(",",".");

        //converte para double
        double lado = Double.parseDouble(entrada);
        //formula area A= L*L
        double area = Math.pow(lado,2);

        //calcula o dobro da area
        double dobroArea = area * 2;
        //imprime a area
        System.out.printf("Dobro da area será: %.2f%n", dobroArea);
        //fecha o scanner
        scan.close();
    }
}