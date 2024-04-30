package arrayList;

import java.util.ArrayList;

public class ReverseAnArrayList {
    static void reverse(ArrayList<Integer> list){
        int i=0;
        int j=list.size()-1;
        while(i<j){
            int temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        System.out.println(list);
        reverse(list);
        System.out.println("after reverse");
        System.out.println(list);

    }
}
