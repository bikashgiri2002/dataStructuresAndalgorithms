package String;

public class FirstLetterToUpperCase {
    public static String upper(String str){
        StringBuilder str1=new StringBuilder("");
        for(int i=0; i<str.length() ; i++){
            if(i==0){
                   str1.append(Character.toUpperCase(str.charAt(i)));
            }
            else if(str.charAt(i)==' ' && i < str.length()-1){
                str1.append(str.charAt(i));
                i++;
                str1.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                str1.append(str.charAt(i));
            }
        }
        return str1.toString();
    }

    public static void main(String[] args) {
        String str="har har mahadev";
        System.out.println(upper(str));
    }

}
