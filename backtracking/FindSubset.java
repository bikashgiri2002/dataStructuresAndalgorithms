package backtracking;

public  class FindSubset {
    static void findSubset(String str,String ans,int i){
        //base case
        if (i==str.length()){
            if (ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //if a element included in subset
        findSubset(str,ans+str.charAt(i),i+1);
        //if a element not included in subset
        findSubset(str,ans,i+1);
    }
    public static void main(String[] args) {
        String str="abcd";
        findSubset(str,"",0);
    }
}
