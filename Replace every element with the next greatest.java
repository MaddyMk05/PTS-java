import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+1];
        for(int i=0;i<=n-1;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<=n-1;i++)
        {
            if(i== n-1)
            {
                a[n-1]=0;
            }
            int max=a[i+1];
            for(int j=i+1;j<=n-1;j++)
            {
              if(max<=a[j])
              {
                  max= a[j];
              }
              a[i]=max;
            }
        }
        for(int i=0;i<=n-1;i++)
        {
        System.out.print(a[i]+" ");
        }
    }
}
