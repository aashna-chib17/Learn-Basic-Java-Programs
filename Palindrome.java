class Main{
    public static void main (String[] args) {
        int n = 1321;
        int temp,rem,ans=0;
        temp = n;
        while(n>0){
            rem = n%10;
            n = n/10; 
            ans = (ans*10)+rem;
        }
        if(temp == ans){
            System.out.printf(temp+" is a palindrome");
        }
        else{
            System.out.printf(temp+" is not a palindrome");
        }
    }
}
