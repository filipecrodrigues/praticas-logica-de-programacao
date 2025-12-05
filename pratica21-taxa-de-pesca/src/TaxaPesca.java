//João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar
// o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes
// maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
// deve pagar uma multa de R$ 4,00 por quilo excedente.
// João precisa que você faça um programa que leia a variável peso
// (peso de peixes) e calcule o excesso. Gravar na variável excessoa quantidade de
// quilos além do limite e na variável multa o valor da multa que João deverá pagar.
// Imprima os dados do programa com as mensagens adequadas.


import java.util.Scanner;

//regulamento = 50
// acima de 50kg + 4,00 por kg
public class TaxaPesca {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.print("Iforme quantidade em Kg pescado: ");
        String entrada = scan.nextLine();
        entrada = entrada.replace(",", ".");

        double quantidade = Double.parseDouble(entrada);

        if (quantidade > 50){
            double excesso = calcularExcesso(quantidade);
            double multa = calcularMulta(excesso);
            System.out.println("Excesso: " + excesso + " Kg");
            System.out.println("Multa: R$ " + multa);
        }
        else{
            System.out.println("Quantidade: " + quantidade + " Kg");
            System.out.println("Não houve excesso. Nenhuma multa aplicada.");
        }
    }

    //função calcular quantidade
    public static double calcularExcesso(double quantidade){
        return quantidade - 50;
    }

    //função calcular a multa
    public static double calcularMulta (double excesso){
        return excesso *4;
    }
}
