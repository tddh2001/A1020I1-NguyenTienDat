import java.util.Scanner;

public class Test_Bubble_Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang: ");
        int size = input.nextInt();
        int[] list = new int[size];
        System.out.println("Nhap vao "+list.length+" phan tu.");
        for (int i=0; i<list.length; i++){
            list[i] = input.nextInt();
        }
        System.out.println("Mang vua nhap la: ");
        for (int i=0; i<list.length; i++){
            System.out.print(list[i]+"\t");
        }
        System.out.print("\nBắt đầu xử lý sắp xếp." + "\t");
        bubbleSortByStep(list);
    }
    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    System.out.println("Đổi " + list[i] + " thành " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
            /* Array may be sorted and next pass not needed */
            if (needNextPass == false) {
                System.out.println("Mảng có thể được sắp xếp và không cần chuyển tiếp theo");
                break;
            }
            /* Show the list after sort */
            System.out.print("List after the  " + k + " sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
        }
    }
}
