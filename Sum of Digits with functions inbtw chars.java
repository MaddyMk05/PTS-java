import java.util.*;

public class main{
    public static int sumDigits(String input1){
        char ch[]=input1.toCharArray();
        int len=input1.length();
        int ts=0;
        for(int i=0;i<len;i++)
        {
            int s=0;
            if(ch[i]>='0' && ch[i]<='9')
            {
                while(i<len && (ch[i]>='0' && ch[i]<='9'))
                {
                    s=(s*10)+(int)ch[i]-48;
                    i++;
                }
                ts=ts+s;
            }
        }
        return ts;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        int sum=sumDigits(input1);
        System.out.print(sum);
    }
}
