package solution;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class DestinationCity {
	public static void main(String[] args) {
		DestinationCity obj = new DestinationCity();
		List<List<String>> cities = new ArrayList<>();		
		
		List<String> p = new ArrayList<>();
		p.add("A");
		p.add("Z");
		cities.add(p);
		
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

		 for(String s : inBound) {
			 if(!hasOutbound.contains(s)) {
				 return s;
			 }
		 }
		 return "";
	 }
}
