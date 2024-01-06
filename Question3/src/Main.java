import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
   List<String> list = Arrays.asList("rohan", "Mohan","Suman","RajeshKumar");
     int biglength= list.stream().mapToInt(s->s.length()).max().orElse(0);
     List<String> ans= list.stream().filter(n->n.length()==biglength).collect(Collectors.toList());
    
     ans.stream().forEach(System.out::println);
	}

}
