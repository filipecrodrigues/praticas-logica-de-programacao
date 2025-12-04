import java.util.Scanner;

//faça um programa que peça 2 numeros inteiros e um real: ok
/*
* Clacule o produto do dorbro do primeiro com a metade do segundo
* a soma do triplo do primeiro com a metade do terceiro
*o terceiro elevado ao cubo
* */
public class ClaculoProdruto {


    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.print("1º número: ");
        int numero1 = scan.nextInt();

        System.out.print("2º número: ");
        int numero2 = scan.nextInt();

        // limpa o ENTER deixado pelos nextInt() buffer
        scan.nextLine();

        System.out.print("3º número: ");
        String entrada = scan.nextLine();
        entrada = entrada.replace(",",".");
        double numero3 = Double.parseDouble(entrada);



        double resultado1 = calcularProduto(numero1, numero2);
        System.out.println("Resultado = "+resultado1);

        double resultado2 = somarTriplo(numero1, numero3);
        System.out.printf("Resultado =%.2f%n ",resultado2);

        double resultado3 = elevarCubo(numero3);
        System.out.printf("Resultado =%.2f%n ",resultado3);

        scan.close();

    }

    //metodo calcular produto //usando cast alterando o retorno da função para doule e evitar o truncamento
    public static double calcularProduto(int numeroA, int numeroB){
        return (numeroA * 2) * (numeroB /2.0);
    }

    //metodo calcular triplo do primeiro + metade do terceiro

    public static double somarTriplo (int numeroA, double numeroC){
        return (numeroA *3 ) + numeroC;
    }
    //elevar terceiro ao cubo

    public static double elevarCubo(double numeroC){
        return Math.pow(numeroC,3);
    }
}
