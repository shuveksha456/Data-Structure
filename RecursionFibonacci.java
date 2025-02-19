public class RecursionFibonacci {
    static int fibonaacci(int n)
    {
      if(n == 0)
      {
        return 0;
      }
      else if  ( n == 1){
         return 1;
      }
      return fibonaacci(n-1)+(n-2);
    }

    static void printFibonacciSeries(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(fibonaacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        int n = 5; // Number of terms
        System.out.println("Fibonacci series up to " + n + " terms:");
        printFibonacciSeries(n);
    }
}


