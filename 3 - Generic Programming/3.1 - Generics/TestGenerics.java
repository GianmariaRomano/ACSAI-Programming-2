import java.util.ArrayList;

public class TestGenerics {
    public static void main(String[] args) {
        GenericList<Integer> i = new GenericList<>(7, null);
        i.insert(3);
        i.insert(8);
        System.out.println(i.get());
        i.insert(1);
        i.insert(2);
        System.out.println(i.get()); // Recall that the new element is always placed at the head of the list.
        i.printList();

        ArrayList<Integer> A = new ArrayList<>();
        A.add(21);
        A.add(8);
        A.add(9);
        A.add(17);
        ArrayList<String> S = new ArrayList<>();
        S.add("this");
        S.add("is");
        S.add("a");
        S.add("generic");
        S.add("method");
        S.add("working");
        S.add("in");
        S.add("a");
        S.add("non-generic");
        S.add("class");
        SpecificClass x = new SpecificClass();
        x.printElements(A);
        x.printElements(S);
    }
}
