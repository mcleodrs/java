public class RecursionDemo{
   public static void main(String[] args){
      message(5);
   }//end main
   public static void message(int n){
      if(n > 0){
         System.out.println("This is a recursive method " + n);
         message(n-1);
         }
   }
}//end class