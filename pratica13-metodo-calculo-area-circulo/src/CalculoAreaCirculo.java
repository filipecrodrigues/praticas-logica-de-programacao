import java.util.Scanner;

//Faça um programa que peça ao usuario para informar o raio de um circulo depois peça sua area
public class CalculoAreaCirculo {

    //classe principal
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o raio de um circulo: ");

        //Lê a entrada como string para aceitar virgula e ponto
        String entrada = scan.nextLine();

        //subistitui virgula por ponto caso o usuário digite virgula
        entrada = entrada.replace(",",".");

        //converte para double
        double raio = Double.parseDouble(entrada);


        // area vai receber metodo calcularAreaDoCirculo com o paramtro raio de retorno
        double area = calcularAreaDoCirculo(raio);

        System.out.printf("Area do raio informado será: %.2f%n", area);


        scan.close();
    }


    //metodo clacular area de um circulo
    //o paramtro raio como um valor double
    //return retorna a area calculada com um valor double

    public static double calcularAreaDoCirculo(double raio){
        //formula = Area = PI *(rario^2)

        return Math.PI * Math.pow(raio,2);
    }



}