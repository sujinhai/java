package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		Stream<String> stream = list.stream();//将它转为流
		
		
//		int [] myArray = {1, 3, 5};
//		int sum = Arrays.stream(myArray).sum();
//		
////		System.out.println(sum);// 结果：9
//		int [] myArray = {1, 3, 5};
//     	int sum = Arrays.stream(myArray).reduce(0, (a,b)->a+b);
//		System.out.println(sum);// 结果：9

		
		
		
		String[] myArray = { "这是", "拼接", "的", "结果" };
		String result = Arrays.stream(myArray)
	                .reduce("结果是：", (a,b) -> a + b);
	
		System.out.println(result);
		
		//Stream<Integer> myStream = Arrays.stream(myArray);//将它转为流
		//Stream<Integer> filterStream = myStream.filter(x->x>2);//只把大于4的流到新的流中
		//filterStream.forEach(x->System.out.println(x));//j结果是 5 
		//Stream<Integer> newStream = myStream.map(x->x*2);//流入到一个新的流
		//newStream.forEach(x->System.out.println(x));
	
		
		
		
		
		
	
		
		list.forEach(item->System.out.println(item));
		
		List<String> lowerString = list.stream().map(x->x.toLowerCase()).collect(Collectors.toList());
		System.out.println(lowerString);
		
		
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("D", 40);
		map.put("E", 50);
		map.put("F", 60);
		
	
		
		
		map.forEach((k,v)->System.out.print("key:"+k+",value:"+v));



	}


}
