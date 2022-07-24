package genericMethods;

public class Print {
    public static <T> void printArray(T[] arr){
        for (T elements: arr){
            System.out.println(elements);
        }
    }
}
