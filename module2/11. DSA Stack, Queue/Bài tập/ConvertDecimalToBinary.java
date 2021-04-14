import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        int dem;
        String bin;
        Scanner scanner = new Scanner(System.in);
        Stack<String> Stack = new Stack<>();
        System.out.println("Covert Demical To Binary: ");
        dem = scanner.nextInt();
        bin = Integer.toBinaryString(dem);
        Stack.push(bin);
        System.out.println("Result: "+Stack.pop());
    }
}
