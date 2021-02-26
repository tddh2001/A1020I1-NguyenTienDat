import java.util.Stack;

public class DaoNguocPhanTuStack {
    public static void main(String[] args) {
        Stack<Integer> Stack = new Stack<>();
        int[] numb = {1, 2, 3, 4, 5};
        for (int i=0; i<numb.length; i++){
            System.out.print(numb[i] + " ");
        }
        for (int i=0; i<numb.length; i++){
            Stack.push(numb[i]);
        }
        System.out.println("Mảng đã đảo ngược: ");
        for (int i=0; i<numb.length; i++){
            System.out.print(Stack.pop()+ " ");
        }
    }
}
