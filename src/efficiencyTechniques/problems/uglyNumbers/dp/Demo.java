package efficiencyTechniques.problems.uglyNumbers.dp;

public class Demo {
    public static void main(String[] args) {
        int n = 15000;
        UglyNumbersDP uglyNumbersDP = new UglyNumbersDP();
        System.out.println(uglyNumbersDP.getNthUglyNumber(n));
    }
}
