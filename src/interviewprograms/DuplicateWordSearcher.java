package interviewprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateWordSearcher {
@SuppressWarnings("unchecked")
public static void main(String[] args) {

    String text = "Ramu Is bad boy Ramu";

    List<String> list = Arrays.asList(text.split(" "));
System.out.println(list);
    Set<String> uniqueWords = new HashSet<String>(list);
    System.out.println(uniqueWords);
    for (String word : uniqueWords) {
        System.out.println(word + ": " + Collections.frequency(list, word));
    }
}
}