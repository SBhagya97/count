import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> employees=new ArrayList<String>();
        employees.add("John");
        employees.add("Mike");
        employees.add("Steve");
        employees.add("Mathew");
        employees.set(2,"Pawan");

        System.out.println(employees);
        System.out.println(employees.get(3));
        System.out.println(employees.size());
        Collections.sort(employees);
        System.out.println(employees);

    }
}
