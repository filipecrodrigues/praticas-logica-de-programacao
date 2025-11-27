
//Leia 5 números em um vetor e exiba-os em ordem inversa.
public class VetorInverso {
    public static void main(String[] args) {

        int [] vetorNumeros = {1, 2, 3, 4 ,5}; //criação de um vetor(array) inteiros de 5 posições


        //laço iniciado de tras pra frente do vetor, o vetor inicia de 5 então 5-1 = 4
        /*Isso significa que o i começa em 4, que é o índice do último elemento do vetor.
         i >= 0 O loop continua enquanto i for maior ou igual a zero.
         Ou seja, ele vai do índice 4 até 0, passando por todos os elementos do vetor.*/
        for (int i = vetorNumeros.length -1; i >= 0; i--) {
            System.out.println(vetorNumeros[i]);
        }
    }
}