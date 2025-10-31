import java.util.Scanner;

//Leia três números inteiros e exiba qual deles é o maior.
public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1° numero: ");
        int numero1 = scan.nextInt();
        System.out.print("2° numero: ");
        int numero2 = scan.nextInt();
        System.out.print("3° numero: ");
        int numero3 = scan.nextInt();

        if (numero1 > numero2 && numero1 >numero3){
            System.out.println("Maior 1°: "+numero1);
        } else if (numero2 >numero1 && numero2 >numero3) {
            System.out.println("Maior 2°: "+numero2);

        }else{
            System.out.println("Maior 3°: "+numero3);
        }
    }
}