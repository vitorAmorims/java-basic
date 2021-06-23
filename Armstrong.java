import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero inteiro? ");
        numero = scan.nextInt();
        
        int n = Integer.toString(numero).length();
        int[] listaDeNumeros = new int[n];

        String numberTxt = Integer.toString(numero);

        for (int i = 0; i < n; i++) {
            listaDeNumeros[i] = Integer.parseInt(String.valueOf(numberTxt.charAt(i)));
        }
        
        int soma = 0;
        for(int i = 0; i < listaDeNumeros.length; i++) {
            soma += Math.pow(listaDeNumeros[i], n);
            System.out.println("numero anterior + " + listaDeNumeros[i] + " elevado "+ n + " igual: " + soma);
        }
        
        if (soma == numero){
            System.out.printf("%nO número digitado %d, é um número Armstrong! %n", numero);
        } else {
            System.out.printf("%nO número digitado %d, Não é um número Armstrong! %n", numero);
        }
    }
}