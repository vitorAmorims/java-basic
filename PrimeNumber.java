import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args) {
        int numero;
        int index, model, flag = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número para saber se é número primo: ");
        numero = scan.nextInt();
        
        model = numero/2;

        if(numero == 0 || numero == 1){
            System.out.println(numero + " is not Prime number");
        } else {
            for (index = 2; index <= model; index++) {
                if(numero % index == 0){
                    System.out.println(numero +" is not prime number");
                    flag = 1;
                    break;
                }
                if (flag == 0) {
                    System.out.println(numero+" is prime number");
                    break;
                }

            }
        }

    }
}