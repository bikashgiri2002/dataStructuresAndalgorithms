package arrayList;

import java.util.ArrayList;

public class StringArrayListSort {
    static void sortArrayList(ArrayList<String> list){
        for(int i=0;i< list.size();i++){
            for (int j=i+1;j< list.size();j++){
                if (list.get(j).compareTo(list.get(i))>0){
                    String temp=list.get(j);
                    list.set(j,list.get(i));
                    list.set(i,temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("abc");
        list.add("acb");
        list.add("cab");
        list.add("das");
        System.out.println(list);
        sortArrayList(list);
        System.out.println(list);
    }
}
