//Imprima todos os números pares de 1 a 50 usando um loop while.
public class Contador {
    public static void main(String[] args) {

        int i = 1; // contador começa em 1

        while (i <=50){ // repete até chegar a 50
            if(i % 2 ==0){ // verifica se é par
                System.out.println(i);
            }
            i++; // incrementa para evitar loop infinito
        }


    }
}