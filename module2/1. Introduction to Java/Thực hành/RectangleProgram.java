import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float width;
        float height;
        float acreage;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chiều rộng: ");
        width = scanner.nextFloat();

        System.out.println("Chiều dài: ");
        height = scanner.nextFloat();

        acreage = width * height;
        System.out.println("Diện tích hình chữ nhật: " + acreage);
    }
}
