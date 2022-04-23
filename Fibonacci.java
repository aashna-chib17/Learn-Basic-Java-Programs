class Main{
    static int a=0,b=1,c;
    static void fib(int n){
        if(n>=1){
            c = a+b;
            System.out.print(" "+c);
            a = b;
            b = c;
            fib(n-1);
        }
    }
    public static void main (String[] args) {
        System.out.print(a+" "+b);
        fib(10);
    }
}
