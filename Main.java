import java.util.Scanner;
public class Main {
    public static void main(String [] args )
    {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int choice;
        choice  = sc.nextInt();
        switch(choice){
            case 1: 
             System.out.println(a+b);
             break;
             case 2 : 
             System.out.println(a-b);
             break;
             case 3 :
             System.out.println(a*b);
             break;
             default :System.out.println("invalid choice" );
        }
    }
    
}
