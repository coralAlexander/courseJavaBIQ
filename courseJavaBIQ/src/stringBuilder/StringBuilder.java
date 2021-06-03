package stringBuilder;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringBuilder {
    public static void main(String[] args) {
        String[] arr = {"Alexander","Nikolaevich","Coral"};
        String lastName = Arrays.stream(arr).skip(1).collect(Collectors.joining(" "));
        System.out.println(lastName);
    }
}
