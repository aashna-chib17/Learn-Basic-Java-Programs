class Main
{
    public static void main (String[] args)
    {
        boolean temp=false;
        int i,n=23;
        for(i=2;i<n/2;i++)
        {
            if(n%i==0){
                temp=true;
            }
        }
        if(temp==true){
            System.out.println(n+" is not a prime number");
        }
        else{
            System.out.println(n+" is a prime number");
        }
    }
}
