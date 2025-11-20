import java.util.Scanner;

//Leia um número inteiro e calcule seu fatorial.
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número para calcular seu fatorial: ");
        int numero = scan.nextInt(); //receber entrada do usuário

        long fatorial = 1; //iniciar a variavel fatorial em 1

        int i = 1; //variavel de inicialização

        while (i <= numero){ //enquanto o i for menor que o número informado
            fatorial = fatorial * i; // pega o valor de fatorial multiplica pelo valor que i recebe e salva em novo valor de fatorial
            i++;  // prepara o próximo valor de i e controla o laço
        }
        System.out.print(numero+ "! = "+fatorial);
    }
}