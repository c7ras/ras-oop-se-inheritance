package ConstructorBehavior;
public class ADemo {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A("seven");
        A a3 = new A(7);
        A a4 = new A("seven",7);
        a2.setX("seven"); 
        a3.setY(7);
        System.out.println("\nX: "+ a2.getX());
        System.out.println("Y: "+ a3.getY());
    }
}
