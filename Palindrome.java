import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        String original, reverse = "";
        int length;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero ou palavra, para saber se é palindromo: ");
        original = scan.nextLine();
        
        length = original.length();

        for(int index = length - 1; index >= 0; index--) {
            reverse = reverse + original.charAt(index);
        }
        if (original.equals(reverse)) {
            System.out.println(original + " é um palindromo");
        } else {
            System.out.println(original + " NÂO é um palindromo");
        }
        
    }
}