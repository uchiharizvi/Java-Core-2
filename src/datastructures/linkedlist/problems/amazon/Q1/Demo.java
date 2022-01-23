package datastructures.linkedlist.problems.amazon.Q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Wrapper;

public class Demo {
    public static void main(String[] args) throws IOException {
        LinkedListSum sum = new LinkedListSum();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            Node node = LinkedListSum.stringToNode(line);
            LinkedListSum.print(node);
            System.out.println(LinkedListSum.maxLinkedListSum(node));
        }
    }


}
