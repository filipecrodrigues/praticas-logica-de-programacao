import java.util.Scanner;

/*Leia um vetor de 10 números inteiros e exiba a soma de todos os elementos.*/
public class SomaVetor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //vetor inteiro de 10 posições
        int [] vetor = new int[10];

        //variavel iniciada com zero para acumular os valores armazenados
        int soma = 0;

        //laço para execultar as posições do vetor no caso 10 posições
        for(int i = 0; i < vetor.length; i++){

            System.out.print("Digite o " + (i + 1) + "º número: "); //exibir mensagem na tela
            vetor [i] = scan.nextInt(); // receber o valor digitado

            soma = soma +vetor[i]; //soma o valor digitado a variavel soma
        }
        System.out.println("Soma dos elementos: " +soma);

        scan.close();
    }
}
