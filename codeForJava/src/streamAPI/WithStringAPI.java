package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithStringAPI {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product(1,"jeans",3500));
		list.add(new Product(2,"tops",4500));
		list.add(new Product(3,"iphone",30500));
		list.add(new Product(4,"tv",35000));
		list.add(new Product(5,"mixer",25900));
		list.add(new Product(6,"dress",2000));
		
	
		
		List<Integer> listprice = list.stream().peek(p -> System.out.println(p))
				.filter(p -> p.price >3000)  //use predicate FI take one value and return boolean value
				.map(p -> (int)p.price).//typecast only filter data(getting only price)
				collect(Collectors.toList());
		
		
		
		
//		List<Double> listofpriceoo = new ArrayList<>();
//		
//		int totalsum = list.stream().filter(p -> p.price >300)
//				                   .peek(l -> listprice.add(l.price))
//				                   .map(o -> o.price).sum();
//			System.out.println(totalsum);	                   
				                   

		System.out.println("list of prices are "+listprice);
		
		
	}

}
