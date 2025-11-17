import java.util.Scanner;

//Leia um ano e informe se ele é bissexto ou não.
public class AnoBissexto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o ano para verificar se é bissexto: ");
        int ano =  scan.nextInt();

        if (ano % 400 ==0){
            System.out.println(ano+ " Bissexto");
        } else if (ano % 4 == 0 & ano % 100 !=0 ) {
            System.out.println(ano +" Bissexto");
        }else {
            System.out.println(ano+" Não é Bissexto");
        }
    }
}