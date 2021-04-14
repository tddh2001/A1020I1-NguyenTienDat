import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println("Mảng ban đầu: " +Arrays.toString(a));
        System.out.println("Nhập 1 phần tử để xóa:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        int indexDel = 0;

        for (int i = 0; i<a.length; i++){
            if (a[i] == x){
                indexDel = i;
            }
        }
        for (int i = indexDel; i < a.length-1; i++){
            a[i] = a[i+1];
        }
        int[] b = Arrays.copyOf(a, a.length-1);
        System.out.println("Mảng sau khi xóa: "+Arrays.toString(b));
        }

    }
