package ooppractice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*Given an integer  as input, check the following:

If  is odd, print "Weird".
If  is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
If  is even and, in between the range of 6 and 20(inclusive), print "Weird".
If  is even and , print "Not Weird".
We given you partially completed code in the editor, complete it to solve the problem.
*/
public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            
        String ans="";
        if(n%2==1){
          ans = "Weired";}
        	else{if(n<=6){
                ans = "Not Weired";}else{
                  if(n<=20){
                ans = "Weired";}else{
               if(n>20){
                ans = "Not Weired";}}}}
        System.out.println(ans);
        }
}
