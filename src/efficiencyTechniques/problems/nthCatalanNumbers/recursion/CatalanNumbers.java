package efficiencyTechniques.problems.nthCatalanNumbers.recursion;

public class CatalanNumbers {

    public int catalan(int n) {
        int res = 0;
        //base case
        if (n <= 1) return 1;
        for (int i = 0; i < n; i++) res += catalan(i) * catalan(n - i - 1);
        return res;
    }
}
