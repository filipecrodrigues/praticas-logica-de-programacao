import java.util.Locale;
import java.util.Scanner;

//Leia uma nota de 0 a 10 e exiba a classificação: Reprovado (0-4), Recuperação (5-7), Aprovado
//(8-10).
class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Informe a nota do Aluno: ");
        String entrada = scan.next().replace(",", ".");
        Double nota = Double.parseDouble(entrada);


        if(nota >=0 && nota <=4){
            System.out.println("REPROVADO");
        }else if (nota > 4 && nota <=7 ) {
            System.out.println("RECUPERAÇÃO");

        } else if (nota >7 && nota <=10) {
            System.out.println("APROVADO");
        }else{
            System.out.println("Nota invalida! Nota não deve ser maior que 10 ou menor que zero");
        }
    scan.close();
    }
}
