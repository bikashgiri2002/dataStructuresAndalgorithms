package String;

import java.util.Arrays;

public class ReverseAllVowel {
    public static String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while(i < j){
            if((ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') && (ch[j] == 'a' ||   ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u')){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
                System.out.println(Arrays.toString(ch));
            }else if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
                j--;
                System.out.println(Arrays.toString(ch));
            }else if(ch[j] == 'a' ||   ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u'){
                i++;
                System.out.println(Arrays.toString(ch));
            }else{
                System.out.println(Arrays.toString(ch));
                i++;
                j--;
            }
        }
        String str = new String(ch);
        return str;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
