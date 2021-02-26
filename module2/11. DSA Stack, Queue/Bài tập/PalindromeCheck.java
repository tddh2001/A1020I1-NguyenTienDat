import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheck {
    public static void main(String[] args) {
        String palindrome = "Able was i ere i saw Elba";
        palindrome = palindrome.toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<palindrome.length(); i++){
            stack.push(palindrome.charAt(i));
        }
        Queue<Character> queue = new LinkedList<>();
        for (int i=0; i<palindrome.length(); i++){
            queue.offer(palindrome.charAt(i));
        }
        boolean flag = true;
        for (int i=0; i<palindrome.length(); i++){
            if (stack.pop() != queue.poll()){
                flag = false;
            }
        }
        if (flag = true) {
            System.out.println(palindrome+" is a Palindrome");
        }
        else {
            System.out.println(palindrome+" is not a Palindrome");
        }
    }
}
