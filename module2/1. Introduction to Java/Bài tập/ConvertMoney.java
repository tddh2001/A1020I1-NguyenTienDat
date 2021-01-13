import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        int usd;
        System.out.println("Chuyển đổi usd sang vnd");
        System.out.println("Nhập usd: ");
        Scanner scanner = new Scanner(System.in);
        usd = scanner.nextInt();
        int vnd = usd * 23000;
        System.out.println(usd + " USD = " + vnd + " VND");

    }
}
