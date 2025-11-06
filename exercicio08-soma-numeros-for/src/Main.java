import java.util.Scanner;

//Leia 5 números do usuário e calcule a soma total.
public class Main {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);


        int soma = 0; // variavel para acumular a soma

        for (int i = 1; i <= 5; i++) {

            System.out.print("Informe o "+i+" º número: ");
            int numero = scan.nextInt();

            soma+= numero;

        }
        System.out.println("Soma dos numeros infprmados é: "+soma);
        scan.close();
    }
}