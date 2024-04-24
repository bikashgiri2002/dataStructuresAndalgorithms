package recursion;

public class PrintAllPermutationOfString {
    static int count=0;
    public static void printPermutation(String str,String permutation){
        if (str.length()==0){
            count++;
            System.out.println(permutation);
        }
        for (int i=0;i<str.length();i++){
            char currentChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPermutation(newStr,permutation+currentChar);
        }
    }

    public static void main(String[] args) {
        String str="abcd";
        printPermutation(str,"");
        System.out.println("no of possibilities is: "+count);
    }
}