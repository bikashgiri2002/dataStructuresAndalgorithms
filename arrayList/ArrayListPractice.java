package arrayList;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        //arrayList Declaration
        ArrayList<Integer> list1= new ArrayList<>();
        //add value add end
        list1.add(1);//[1]
        list1.add(2);//[1,2]
        list1.add(3);//[1,2,3]
        //get value from
        System.out.println(list1.get(1));
        //add value at an index
        list1.add(2,10);//[1,2,10,3]
        //modify value at a index
        list1.set(2,100);//[1,2,100,3]
        //print using for loop
        for (int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+", ");
        }
        System.out.println();
        //print directly
        System.out.println(list1);
        //remove a element by index
        list1.remove(2);//[1,2,3]
        System.out.println(list1);
        list1.add(10);//[1,2,3,10]
        System.out.println(list1);
        //remove a element by value
        list1.remove(Integer.valueOf(10));
        System.out.println(list1);
        list1.add(10);//[1,2,3,10]
        //check presence
        System.out.println(list1.contains(Integer.valueOf(10)));
        System.out.println(list1.contains(Integer.valueOf(100)));
        //contain different value
        ArrayList list2=new ArrayList<>();
        list2.add(9);
        list2.add(true);
        list2.add("hari");
        list2.add(5.6f);
        //print
        System.out.println(list2);
    }
}
