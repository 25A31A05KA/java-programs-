public class Variable {
    
        int a=18;           //instance variable  
        String name="bhavya"; //instance variable
        static int b=18;  // static variable 
           void main()
           {
            int x=7 ;
            System.out.println(a); // local variable 
              
           }
           public static void main(String args [])
           {
            Variable v=new Variable (); //creating object for instance variable 
              System.out.println(v.a);   
              System.out.println(v.name );
              System.out.println(b);
           }
    
}