package collections.streams;

import utilities.StringGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        for(int i=0;i<100;i++){
            namesList.add(StringGenerator.generateStringPlain());
        }
        //Filter Operation
        List<String> namesStartsWithA = new ArrayList<>();
        namesStartsWithA = namesList.stream().filter(a->a.startsWith("a")).collect(Collectors.toList());

        //Sort Operation
        Collections.sort(namesList);//sorting
        System.out.println(namesList);
        System.out.println(namesStartsWithA);

    }
}
