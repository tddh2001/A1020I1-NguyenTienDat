package Fan;

import java.util.Scanner;

public class TestFan {
    public static void main(String[] args) {
        int speed;
        boolean onOff;
        double radius;
        String color;
        Scanner input = new Scanner(System.in);
        System.out.println("Input on/off (true/false)");
        onOff = input.nextBoolean();
        System.out.println("Input speed:");
        speed = input.nextInt();
        System.out.println("Input Radius:");
        radius = input.nextDouble();
        input.nextLine();
        System.out.println("Input color:");
        color = input.nextLine();
        Fan f1 = new Fan(speed , onOff, radius, color);
        System.out.println(f1.toString());
    }
}
