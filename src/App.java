import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        
        System.out.println("Qual o valor da base da pirâmide?: ");
        int input = Integer.parseInt(scanner.nextLine());

        System.out.println("----------------");

        for (int i = 1; i <= input; i++) {
            System.out.println(("" + i).repeat(i));
        }
    }
}