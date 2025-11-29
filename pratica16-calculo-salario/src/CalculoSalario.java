import java.util.Scanner;

//Faça um programa que pergunte ao usuario qual o valor da hora e quantas horas trabalhada no mês
public class CalculoSalario {
    public static void main(String[] args) {
        //classe scaner receber dados do teclado
        Scanner scan = new Scanner(System.in);

        //entrada valor da hora feito pelo usuario
        System.out.print("Informe o valor da sua hora: ");
        //recebendo variavel entrada primeiro como uma string
        String entradaValor = scan.nextLine();
        //configurando a entrada para que receba . e ,
        entradaValor = entradaValor.replace(",", ".");

        //convertanto a variavel string entrada para double
        double valorHora = Double.parseDouble(entradaValor);

        //solicitando ao usuario quantas horas trabalhadas no mes
        System.out.print("Informe quantas horas trabalhadas no mês: ");
        String entradaHoras = scan.nextLine();

        //cofigurando para que a entrada receba . e ,
        entradaHoras = entradaHoras.replace(",",".");
        //convertendo
        double horasTrabalhadas = Double.parseDouble(entradaHoras);

        //calculando salario do mês
        Double salario = valorHora * horasTrabalhadas;

        //imprimindo salario
        System.out.printf("Salario mês: R$ %.2f%n", salario);

    scan.close();

    }
}
