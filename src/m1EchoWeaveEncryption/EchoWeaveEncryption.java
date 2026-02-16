package m1EchoWeaveEncryption;
import java.util.*;
import java.util.Map.Entry;

public class EchoWeaveEncryption {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
		String str = "success";
		
//		1
		for(int i = 0;i < str.length(); i++) {
			if(!Character.isLetter(str.charAt(i))) {
				System.out.println(str + " is an invalid input");
				return;
			}
		}
		
//		2
		str = str.toUpperCase();
		System.out.println(str);
		
//		3
		System.out.println("Frequency of each char");
		char arr[] = str.toCharArray();
		
		int count = 0;
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i = 0;i < arr.length; i++) {
			count = 0;
			for(int j = 0;j < str.length(); j++) {
				if(arr[i] == str.charAt(j)) {
					count+=1;
				}
			}
			map.put(arr[i], count);
		}
		
		System.out.println(map);
		
//		4
		
		List<Character> evenList = new LinkedList<>();
		List<Character>	oddList = new LinkedList<>();
		
		for(Map.Entry<Character, Integer> m: map.entrySet()) {
			if(m.getValue() % 2 == 0) {
				evenList.add(m.getKey());
			}else {
				oddList.add(m.getKey());
			}
		}
		
		System.out.println(evenList);
		System.out.println(oddList);
		
		System.out.println("Initial Build");
		
		char arr1[] = new char[evenList.size() + oddList.size()];
		
		int index = 0;
		for(char i: evenList) {
			arr1[index++] = i;
		}
		
		for(char i: oddList) {
			arr1[index++] = i;
		}
		
		String groupString = new String(arr1);
		
		System.out.println(groupString);
		
		
//		5

		for (Map.Entry<Character, Integer> m : map.entrySet()) {
            for (int i = 1; i < m.getValue(); i++) {
                groupString += m.getKey();
            }
        }
		
		System.out.println(groupString);
		
		Set<Character> set = new LinkedHashSet<>();
		
		count = 0;
		for(Map.Entry<Character, Integer> m1: map.entrySet()) {
			if(m1.getValue() == 1) {
				set.add(m1.getKey());
				count+=1;
			}
		}
		
		System.out.println(set);
		System.out.println(count);
		
		StringBuilder res = new StringBuilder();
		res.append(groupString);
		
		 if (count > 0) {
	            int len = groupString.length();
	            int index1;

	            if (len % 2 == 0) {
	                index1 = (len / 2) - 1; 
	            } else {
	                index1 = len / 2;
	            }

	            res.insert(index1+1 , count);
	        }
		
		
		 System.out.println(res.toString());
		
		
		
		
	}
}
