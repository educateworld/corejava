package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysAsListForEach {
	public static void main(String[] args) {
		Arrays.asList("ramu","uma","umaram").forEach(e->System.out.println(e));
		List<String> names=new ArrayList<String>();
		/*names.stream()
		.map(e->System.out.println (e))
		.filter(e->e.equals("ramu")).collect(Collectors.toList());*/
	}

}
