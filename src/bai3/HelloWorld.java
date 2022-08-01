package bai3;

public class HelloWorld {
    public static void main(String []args) {
        elapsedTime();
    }
    public static void elapsedTime() {
        long t1, t2, t3;
        t1 = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            fib(11);
        }
        t2 = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            fib1(11);
        }
        t3 = System.nanoTime();
        System.out.println("Running time = " + ((t2 - t1) / 1000000) + "ms");
        System.out.println("Running time = " + ((t3 - t2) / 1000000) + "ms");

    }
    public static long fib(long n) {
        // đệ quy tốn thời gian -> ko nên dùng
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n-1) + fib(n - 2);
        }
    }

    public static long fib1(long n) {
        //vòng lặp nên dùng
        long prefib = 0;
        long fib = 1;
        if (n <= 1) fib = n;
        for (long i = 2; i <=n; i++){
            fib = fib + prefib;
            prefib = fib - prefib;
        }
        return fib;
    }
}
