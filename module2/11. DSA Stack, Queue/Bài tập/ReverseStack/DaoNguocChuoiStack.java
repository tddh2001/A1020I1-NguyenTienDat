import java.util.Stack;

public class DaoNguocChuoiStack {
    public static void main(String[] args) {
        Stack<Character> wStack = new Stack<>();
        String mWord = "mWord";
        System.out.println("Chuỗi ban đầu: " + mWord);
        for (int i=0; i<mWord.length(); i++){
            wStack.push(mWord.charAt(i));
        }
        for (int i=0; i<mWord.length();i++) {
            System.out.print(wStack.pop());
        }
    }
}
