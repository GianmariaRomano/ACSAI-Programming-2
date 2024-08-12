import java.util.ArrayList;

public class SpecificClass {
    public static <T> void printElements(ArrayList<T> array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
