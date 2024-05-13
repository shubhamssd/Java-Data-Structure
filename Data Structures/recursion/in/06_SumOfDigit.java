package recursion.in;

 class SumOfDigit {
    public static void main(String[] args) {
        int num = sumOfDigit(5467);
        System.out.println(num);
    }

    static int sumOfDigit(int n){
        if (n >= 1 && n <= 9) {
            return n;
        }

        return sumOfDigit(n/10) + n%10;
    }

}
