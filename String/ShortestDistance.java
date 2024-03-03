package String;
import java.util.*;

public class ShortestDistance {
    public static float shortestRoute( String str){
        float distance=0;
        int x=0,y=0;
        for(int i=0; i<str.length(); i++){
            switch(str.charAt(i)){
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                default:
                    System.out.println("Wrong direction");
            }
        }
        distance =(float)Math.sqrt((x*x)+(y*y));
        return distance;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Direction you Want to travel:");
        String str = sc.nextLine();
        str=str.toUpperCase();
        float distance=shortestRoute(str);
        System.out.println("Shortest Distance Between Two point is "+distance);
    }
}
