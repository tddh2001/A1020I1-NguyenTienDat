import java.util.Scanner;

public class TimGiaTri {
    public static void main(String[] args) {
        String[] students = {"Dat", "Dan", "Cuong", "Duc", "Son", "Mit", "Dut"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tìm kiếm tên:");
        String name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++){
            if (students[i].equals(name)) {
                System.out.println("Vị trí của "+ name +" nằm ở vị trí " +(i+1));
                isExist = true;
                break;
            }
        }
        if(!isExist) {
            System.out.println("Không tìm thấy tên bạn vừa nhập.");
        }
    }
}
