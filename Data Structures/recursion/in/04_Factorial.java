package recursion.in;

 class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));

    }

    static int fact(int n){

        if(n == 0)      ///base case
            return 1;

        return n * fact(n - 1);  // Smaller problem - Recursive work
                                    //big problem - self work
    }
}
