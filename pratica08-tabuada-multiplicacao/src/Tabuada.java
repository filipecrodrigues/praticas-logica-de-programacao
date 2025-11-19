import java.util.Scanner;

//Leia um número inteiro e exiba a tabuada de multiplicação de 1 a 10.
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            int tabuada = numero * i;
            System.out.println(numero+ " x "+i+" = "+tabuada);
        }

    }
}