import java.util.Scanner;

public class Fatorial{
    public static void main(String[] args){
        int soma = 1;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero para calcular o fatorial: ");
        int numero  = scan.nextInt();
        for(int index = numero; index > 0; index--){
            soma *= index;
        }
        System.out.printf("O fatorial de: %d é igual %d%n", numero, soma);
    }
}