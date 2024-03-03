package String;

import java.util.Scanner;

public class BasicSring {
    public static void main(String[] args) {
        String s;
        Scanner sc= new Scanner(System.in);
        boolean pa=true;
        System.out.println("Enter the String");
        s=sc.nextLine();
        for (int i=0; i<s.length()/2; i++){
            if (s.charAt(i) == s.charAt(s.length()-1-i)){
                pa=true;
            }
            else{
                pa=false;
                break;
            }
        }
        if (pa == true){
            System.out.println(s+" is palindrome");
        }
    }
}
