package String;

public class MergeAlternate {
    public static void main(String[] args) {
        String a ="abc";
        String b = "pqr";
        String c = a+b;
        String d = Character.toString(a.charAt(0) + b.charAt(0));
        System.out.println(c);
        System.out.println(d);
    }
}
