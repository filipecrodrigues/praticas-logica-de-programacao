import java.util.Scanner;

//Leia a idade de uma pessoa e informe se ela é menor, maior ou igual a 18 anos.
public class MaiorIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        int idade = scan.nextInt();

        if (idade < 18){
            System.out.println("Menor de idade");
        } else if (idade ==18) {
            System.out.println("Idade igual a 18");

        }else {
            System.out.println("Maior de idade ");
        }

    scan.close();
    }
    }
