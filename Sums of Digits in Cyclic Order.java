import java.util.*;

public class main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0)
        {
            int t=n;
        while(t>0)
        {
            int x= t%10;
            sum=sum+x;
            t/=10;
        }
        n=n/10;
    }
    System.out.print(sum);
    }
}


