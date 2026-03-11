package day9;
import java.util.*;//Includes all
public class SetComparison {
    public static void main(String[] args) {
        Set<Integer> hashset=new HashSet<>(Arrays.asList(30,10,50,20,40));
        Set<Integer> linkedhashset=new LinkedHashSet<>(Arrays.asList(30,10,50,20,40));
        Set<Integer> tree=new TreeSet<>(Arrays.asList(30,10,50,20,40));

        System.out.println("HashSet(unordered set)"+hashset);
        System.out.println("LinkedHashtSet(unordered set)"+linkedhashset);
        System.out.println("TreeSet(sored set)"+tree);


    }
}
