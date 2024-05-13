package recursion.in;

class SumofNto1 {
    public static void main(String[] args) {
        int ans = sum(5);
        System.out.println(ans);

        int ansfact = fact(5);
        System.out.println(ansfact);
    }

    static int sum(int n){
        if (n <= 1)
            return 1;

        return n + sum(n -1);
    }

    static int fact(int n){
        if (n <= 1)
            return 1;

        return n * fact(n-1);
    }

}
