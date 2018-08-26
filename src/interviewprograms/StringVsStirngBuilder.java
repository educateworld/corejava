package interviewprograms;

import java.util.HashMap;
import java.util.Map;

public class StringVsStirngBuilder{
public static void main(String[] args){

    String s ="aaabbbbccccdd";
    StringBuilder sb = new StringBuilder("aaabbbbccccdd");
Map<Character, Integer> map=new HashMap<Character, Integer>();
    	for(int i=0;i<sb.length();i++)
    	{
        char ch = sb.charAt(i);
        map.put(ch,i);
    }
    	
    	//map.entrySet();
    	System.out.println(map);
}
}