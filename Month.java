import java.util.*;
public class Month {
    public static void main(String [] args ){
        Scanner op=new Scanner(System.in);
        int month=op.nextInt();
        switch(month){
            case 1 :
                System.out.println("jan");
                break;
                case 2 : 
                System.out.println("feb");
                break;
                case 3:
                    System.out.println("may");
                    break;
                    default : System.out.println("no month declared ");

        }
    }
}
