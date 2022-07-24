package genericClasses;

public class Main {
    public static void main(String[] args) {
        int a=10;
        Nullable<Integer> nullable=new Nullable<>(a);
        nullable.run();
    }
}
