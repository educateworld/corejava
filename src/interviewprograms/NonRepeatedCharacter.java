package interviewprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NonRepeatedCharacter {
 
   public static void main(String[] args) throws IOException {
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   System.out.println("Please enter input String:");
	  String s=br.readLine();;
	  Map <Character, Integer> map=new HashMap<Character,Integer>();
	  char c[]=s.toCharArray();
	  for(char ch :c)

	  {
		  if(map.containsKey(ch))
		  {
			  int count=map.get(ch);
			 // System.out.println("count"+count);
			  map.put(ch,count+1);
		  }
		  else
		  {
			  map.put(ch, 1);
		  }
		  
	  }
	  for(char ch:c)
	  {
		  if(map.get(ch)==1)
		  {
			  System.out.println("First Non Repeted Character:"+ch);
			  break;
		  }
		  
	  }
	  }
}