package pattern;

public class PascalTriangle {
    static int factorial(int n ){
        int fact=1;
        if (n== 0){
            return 1;
        }
        else {
            for (int i=1; i<=n; i++){
                fact=fact*i;
            }
        }
        return fact;
    }
    static void factorialPascal(int n){
        for (int i=0; i<=n; i++){
            for (int j=0; j<= n-i; j++){
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++){
                System.out.print(" "+factorial(i)/(factorial(i-j)*factorial(j)));
            }
            System.out.println();
        }

    }
    static void formulaPascal(int n){
        for (int i=1; i<=n; i++){
            for (int j=0; j<=n-i; j++){
                System.out.print(" ");
            }
            int c=1;
            for (int j=1; j<=i ; j++){
                System.out.print(c+" ");
                c=c*(i-j)/j;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        factorialPascal(5);
        formulaPascal(5);
    }
}
