package practise;

import java.util.*;
public class Main1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
//        String str1 = "abef";
//        String str2 = "tuvwxyz";
//        
//        StringBuilder strb3 = new StringBuilder();
//        
//        if(str1.length() >= str2.length()) {
//        	int lastIndex = 0;
//        	for(int i = 0; i < str2.length(); i++) {
//        		strb3.append(str1.charAt(i));
//        		strb3.append(str2.charAt(i));
//        		lastIndex++;
//        	}
//        	System.out.println(strb3);
//        	strb3.append(str1.substring(lastIndex, str1.length()));
//        }
//        
//        if(str1.length() < str2.length()) {
//        	int lastIndex = 0;
//        	for(int i = 0; i < str1.length(); i++) {
//        		strb3.append(str1.charAt(i));
//        		strb3.append(str2.charAt(i));
//        		lastIndex++;
//        	}
//        	System.out.println(strb3);
//        	strb3.append(str2.substring(lastIndex, str2.length()));
//        }
//        
//        
//        System.out.println(strb3);
        
//        ascii even # odd @
        
        String finalString  = "atbuevfwxyz";
        
        StringBuilder strb = new StringBuilder();
        
        for(int i = 0;i < finalString.length(); i++) {
        	char ch = finalString.charAt(i);
        	if(ch % 2 == 0) {
        		strb.append("#");
        	}else {
        		strb.append(ch);
        	}
        }
        
        System.out.println(strb);
        
//        String merge = str1 + str2;
//
//        for(int i = 0;i < merge.length(); i++){
//            if(merge.charAt(i) == ' '){
//                System.out.println(merge + " is an invalid input");
//                return;
//            }
//        }
//
//        System.out.println(merge);
//        StringBuilder strb = new StringBuilder();
//        strb.append(merge);
//        strb.reverse();
//
//        String lower = strb.toString().toLowerCase();
//        System.out.println(lower);
//        StringBuilder finalString = new StringBuilder();
//
//        for(int i = 0;i < lower.length(); i++){
//            char ch = lower.charAt(i);
//            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//            	finalString.append(ch);
//            }else {
//            	finalString.append("#");
//            }
//        }
//
//        System.out.println(finalString.toString());


    }
}
















