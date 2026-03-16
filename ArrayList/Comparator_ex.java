package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }

}

public class Comparator_ex {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        list.sort(null);  // bydefault acsending
        System.out.println(list); 

        List<String> words = Arrays.asList("banana", "apple", "orange");
        words.sort(new StringLengthComparator());
        System.out.println(words );
        
    }
} 
