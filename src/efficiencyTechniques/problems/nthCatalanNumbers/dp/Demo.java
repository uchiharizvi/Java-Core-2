package efficiencyTechniques.problems.nthCatalanNumbers.dp;

public class Demo {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            System.out.println(CatalanDP.catalanDP(i) + " ");
        }
    }
}
