package recursion.in;

 class Fibonacci {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(fibo(i));
//        }

        //or

          System.out.println(fibo(9));
    }

    static int fibo(int n){
        ///base case
        if(n == 0 || n == 1)
            return n;

        return fibo(n-1) + fibo(n-2);



//        // Smaller problem - Recursive work
//        int prev = fibo(n-1);
//        int prevPre = fibo(n-2);
//
//        //big problem - self work
//        return prev + prevPre;
    }
}
