
void main() {

    Scanner scan =new Scanner(System.in);
    System.out.print("Informe um número inteiro pra verificar se é par ou impar: ");
    int numero = scan.nextInt();

    if (numero % 2 == 0){
        System.out.println(numero+ " Par");
    }else {
        System.out.println(numero+ " Impar");
    }
}
