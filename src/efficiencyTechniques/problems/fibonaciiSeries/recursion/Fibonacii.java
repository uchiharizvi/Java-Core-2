package efficiencyTechniques.problems.fibonaciiSeries.recursion;

public class Fibonacii {
    static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
