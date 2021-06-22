import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3, count, index;
        
        System.out.println("Digite o número de sequencias Fibonacci que deseja: ");
        count = scan.nextInt();

        System.out.print(n1 + " " + n2);
        for (index = 2; index <= count; index++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.printf("%n------%n");
        
    }
}