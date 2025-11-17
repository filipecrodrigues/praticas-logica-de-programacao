import java.util.Locale;
import java.util.Scanner;

//Leia uma nota de 0 a 10 e exiba a classificação: Reprovado (0-4), Recuperação (5-7), Aprovado
//(8-10).
public class ClassificaNotas {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Quantos alunos irá cadastrar? ");

        int quantidadeAlunos = scan.nextInt();
        double nota = 0.0;

        for (int i = 1; i <= quantidadeAlunos; i++ ){
            System.out.print( "nota" + i + "° aluno: ");
            nota = scan.nextDouble();
            if (nota >= 0 && nota <= 4){
                System.out.println("REPROVADO");
            } else if (nota >=5 && nota <=7 ) {
                System.out.println("RECUPERAÇÃO");
            }else if (nota >=8 && nota <=10 ) {
                System.out.println("APROVADO");
            }else{
                System.out.println("Nota Invalida!");
            }

        }
        scan.close();
        }
    }
