import java.util.Scanner;

//Leia 10 números em um vetor e exiba o maior e o menor número.
public class Main {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);//leitura dos dados pelo teclado

        int[] numeros = new int[10]; //vetor para armazenar 10 posições

        int maior;
        int menor;

        //laço para ler os 10 numeros informados no vetor
        for (int i =0; i < 10; i++){
            System.out.print((i + 1)+" ° número: ");
            numeros[i] = scan.nextInt(); //nuemros da posição i do vetor recebe o número
        }

        //inicializa maior e menor numero cm primeiro elemento do vetor
        maior = numeros[0];
        menor = numeros[0];

        //for para encontrar o maior e menor numero
        //começando do segundo elemento indice 1 pois o priemiro ja foi utilizado
        for (int i =1; i < 10; i++){

            //verifica se o numero atual (numeros[i]) é maior que o valor armazenado na variavel maior
            if (numeros[i] > maior){
                // se for maior o valor da variavel, o  maior é atualizado para o valor do elemento atual
                maior = numeros[i];
            }
            //verifica se o numero atual (numeros[i]) é menor que o valor armazenado na variavel menor
            if (numeros[i] < menor){

                // se for menor o valor, o valor da variavel menor é atualizado para o valor do elemento atual
                menor = numeros[i];

            }
        }
        scan.close();

        System.out.println("Maior número: "+maior);
        System.out.println("Menor número: "+menor);

    }
}