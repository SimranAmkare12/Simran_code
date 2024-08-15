package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class WithoutStreamAPI {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product(1,"jeans",3500));
		list.add(new Product(2,"tops",4500));
		list.add(new Product(3,"iphone",30500));
		list.add(new Product(4,"tv",35000));
		list.add(new Product(5,"mixer",25900));
		list.add(new Product(6,"dress",2000));
		
		ArrayList<Integer> ss = new ArrayList<>();  
		
		int sum = 0;
		for(Product p : list) {
			if(p.price > 3000) {
				
				ss.add((int) p.price);
				sum += p.price ;
				
			}
			
		}
		System.out.println(ss);	
		System.out.println(sum);
		
	}

}
