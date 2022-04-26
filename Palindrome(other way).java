import java.util.*;  
class Main{
    public static void main (String[] args) {
        String actual,reverse="";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter either a string/number to check if it is a palindrome");
        actual = in.nextLine();
        int l = actual.length();
        for(int i = l-1; i>=0;i--){
            reverse = reverse+actual.charAt(i);
        }
        if(actual.equals(reverse)){
            System.out.printf(actual+" is a palindrome");
        }
        else{
            System.out.printf(actual+" is not a palindrome");
        }
    }
}
