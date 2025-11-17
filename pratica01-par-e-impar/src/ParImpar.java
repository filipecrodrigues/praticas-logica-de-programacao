import java.util.Scanner;

//Leia um número inteiro e informe se ele é par ou ímpar.
public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Verifica par e Impar");
        System.out.print("Informe um número inteiro: ");
        int numero = scan.nextInt();

        if (numero % 2 == 0){
            System.out.println(numero+ " Par! ");
        }else {
            System.out.println(numero+ " Impar!");
        }


    }
}