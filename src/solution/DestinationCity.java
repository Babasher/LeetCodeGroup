package solution;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class DestinationCity {
	public static void main(String[] args) {
		DestinationCity obj = new DestinationCity();
		List<List<String>> cities = new ArrayList<>();
//		List<String> c1 = new ArrayList<>();
//		c1.add("B");
//		c1.add("C");
//		List<String> c2 = new ArrayList<>();
//		c2.add("D");
//		c2.add("B");
//		List<String> c3 = new ArrayList<>();
//		c3.add("C");
//		c3.add("A");
		
		List<String> p = new ArrayList<>();
		p.add("A");
		p.add("Z");
		cities.add(p);
		
		
//		cities.add(c1);
//		cities.add(c2);
//		cities.add(c3);
		
		String result = obj.destCity(cities);
		
		System.out.println(result);
		
	}
	
	 public String destCity(List<List<String>> paths) {
		 Set<String> hasOutbound = new HashSet<>();
		 Set<String> inBound = new HashSet<>();
		 for(List<String> city : paths) {
			 hasOutbound.add(city.get(0));
			 inBound.add(city.get(1));
		 }
		 
//		 System.out.println(hasOutbound.toString());
//		 System.out.println(inBound.toString());
		 
		 
		 for(String s : inBound) {
			 if(!hasOutbound.contains(s)) {
				 return s;
			 }
		 }
		 return "";
	 }
}
