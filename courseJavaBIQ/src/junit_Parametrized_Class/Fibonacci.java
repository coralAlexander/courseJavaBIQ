package junit_Parametrized_Class;

public class Fibonacci {
  
   public int[] fibo2(int num) {
        if ( num<=1) {
            return new int[]{1,1};  
        }
        int[] arr = fibo2(num-1);   
        return new int[] {arr[1],arr[0]+arr[1]};
    }
   
   private static void fibo3(int num) {
       int fibo1 = 1;
       int fibo2 = 0;
       int fibonachi;
       for (int i = 0; i < num; i++) {
           fibonachi = fibo1 + fibo2;
           fibo1 = fibo2;
           fibo2 = fibonachi;
           System.out.print(fibonachi + ", ");
       }
   }
}
