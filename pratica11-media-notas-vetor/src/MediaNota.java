import java.util.Scanner;

//Leia 5 notas em um vetor e calcule a média.
public class MediaNota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] notas = new double[5]; // vetor double notas recebe 5 posições
        double soma = 0; //variavel de inicialização iniciando em 0

        for (int i = 0; i < notas.length; i++) { //for para passar pelas notas

            System.out.print("Informe " +(i +1)+"° nota: ");
            notas[i] = scan.nextDouble(); //notas inofmradas pelo usuário armaznar na posição i
            soma += notas[i];//somar as notas recebidas em cada psosição
        }

        double media = soma / notas.length; //variavel media para receber soma das notas dividido pelo tamanho do vetor

        System.out.printf("Média aluno = %.2f", media);
    }
}