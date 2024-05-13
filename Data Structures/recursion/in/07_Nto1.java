package recursion.in;

class Nto1 {
    public static void main(String[] args) {
//        funRev(5);
//        fun(5);
        funBoth(5);
    }

    static void fun(int n){
        if(n == 0)
            return;

        System.out.println(n);
         fun(n -1);
    }

    static void funRev(int n){
        if(n == 0)
            return;


        funRev(n -1);
        System.out.println(n);
    }

    //both

    static void funBoth(int n){
        if(n == 0)
            return;

        System.out.println(n);
        funBoth(n -1);
        System.out.println(n);
    }
}
