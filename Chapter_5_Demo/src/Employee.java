
public class Employee {

    private StringBuilder sb = new StringBuilder("Amin Ziarkash"); // Different ID

    public StringBuilder getName() {
        return new StringBuilder(sb);
    }

    void printName() {
        System.out.println("encapsulated, mutable StringBuilder content\t:\t" + sb);
    }
}
