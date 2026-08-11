import java.util.*;
public class Even {
    public static void main(String [] args){
        int n,i,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=2;i<=n;i=i+2)
        {
             sum=sum + i;

        }
        System.out.println(sum);
    }
}
