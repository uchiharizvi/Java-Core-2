package corejava.collections.set;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Kavish");
        uniqueNames.add("Tooba");
        uniqueNames.add("Kavish");
        System.out.println(uniqueNames);
    }
}
