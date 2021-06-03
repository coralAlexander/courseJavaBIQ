package reverse_Massive;

import java.util.Arrays;

public class ReverseMassive {

    public static void main(String[] args) {
        String[] myArray = new String[] {"a","f","g","t","9","d","o","i"};
        sort(myArray);
    }

    public static void sort(String[] massive) {
        for (int i = 0; i < massive.length / 2; i++) {
            String tmp = massive[i];
            massive[i] = massive[massive.length - i - 1];
            massive[massive.length - i - 1] = tmp;
        }
        System.out.println(Arrays.toString(massive));
    }
}
