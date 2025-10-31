import java.util.Scanner;

//Leia um ano e informe se ele é bissexto ou não.
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um ano para verificar se é bissexto:");
        int ano = scan.nextInt();

        if (ano % 400 ==0 ){ // lemrar de adicionar esta primeiro
            System.out.println("Ano Bissexto");
        } else if (ano % 100 == 0) {
            System.out.println("Ano Não Bissexto");

        }else if (ano %4 ==0){
            System.out.println("Ano Bissexto");
        }else{
            System.out.println("Ano Não Bissexto");
        }
    }
}