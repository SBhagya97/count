import java.util.HashSet;
import java.util.Set;

public class Hash_Set {
    public static void main(String[] args) {
        Set<Integer> dataset=new HashSet<Integer>();
        System.out.println(dataset.add(1));
        System.out.println(dataset.add(2));
        System.out.println(dataset.add(3));
        System.out.println(dataset.add(4));
        System.out.println(dataset.add(4));

        System.out.println(dataset);

        System.out.println("list contains or not: "+dataset.contains(1));
    }
}
