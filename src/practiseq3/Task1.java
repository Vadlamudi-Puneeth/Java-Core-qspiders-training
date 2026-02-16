package practiseq3;

public class Task1 {
	public static void main(String[] args) {
		
		String s1 = "Java Developer";
		String s2 = "Senior Java Developer";
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		String longest = "";
        if (!s1.matches("[a-zA-Z0-9 ]*") || !s2.matches("[a-zA-Z0-9 ]*")) {
            System.out.println("Input strings must contain only alphabets, numbers, and spaces");
            return;
        }

		for(int i = 0;i < s1.length(); i++) {
			for(int j = i + 1; j <= s1.length(); j++) {
				String sub = s1.substring(i, j);
				
				if(s2.contains(sub) && sub.length() > longest.length()) {
					longest = sub;
				}
			}
		}
		
		System.out.println(longest.length());
		System.out.println(longest);
		
		
		
	}
}
