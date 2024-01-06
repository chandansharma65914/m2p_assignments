import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
        ArrayList<Integer> intlist= new ArrayList<>();
        
        intlist.add(2);
        intlist.add(4);
        intlist.add(5);
        intlist.add(6);
        intlist.add(7);
        intlist.add(5);
        intlist.add(3);
        intlist.add(11);
        
        List<Integer> evenlist= intlist.stream()
        		.filter(n->n%2==0).collect(Collectors.toList());
        evenlist.stream().forEach(System.out::println);
        
        int even_square_sum= evenlist.stream().mapToInt(n->n*n).reduce(0, (a,b)->a+b);
        System.out.println(even_square_sum);
	}

}
