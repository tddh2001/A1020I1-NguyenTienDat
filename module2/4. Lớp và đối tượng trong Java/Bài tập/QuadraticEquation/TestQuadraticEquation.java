public class TestQuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation res1 = new QuadraticEquation(1, 3, 1);
        if(res1.getDiscriminant()<0) System.out.println("The equation has no roots");
        else if(res1.getDiscriminant()==0) System.out.println("The equation has one root: "+res1.getRoot1());
        else{
            System.out.println("The equation has two roots: ");
            System.out.println("Denta is: "+res1.getDiscriminant());
            System.out.println("Root1 is: "+res1.getRoot1());
            System.out.println("Root2 is: "+res1.getRoot2());
        }
    }
}
