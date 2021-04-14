import java.util.Scanner;

public class DaoNguoc {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập kích thước:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Kích thước không vượt quá 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        for (i = 0; i < array.length; i++){
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s", "Các phần tử trong mảng là : ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("%-20s%s", "Đảo ngược: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
