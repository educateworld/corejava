package interviewprograms;
public class SeparateAlphabetsAndDigitsFromString {
    public static void main(String[] args) {
    	String a="a1b2c3";
        int sum = 0;
        String num = "";
        for(int i = 0; i < a.length(); i++) {
            if(Character.isDigit(a.charAt(i))) {
                num = num + a.charAt(i);
                sum = sum + Integer.parseInt(num);
            } else {
                if(!num.equals("")) {
                    
                    num = "";
                }
            }
        }

        System.out.println(sum);
    }
} 