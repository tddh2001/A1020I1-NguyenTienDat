public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(1 , "Dat");
        Student s2 = new Student(2, "Cuong");

        s1.display();
        s2.display();
    }
}
