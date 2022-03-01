
import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> employees=new LinkedList<>();
        employees.add("John");
        employees.add("Mike");
        employees.addLast("Steve");
        employees.addFirst("Mathew");

        employees.add(2, "Nalin");
        System.out.println(employees);

    }
}
