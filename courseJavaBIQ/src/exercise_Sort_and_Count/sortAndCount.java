package exercise_Sort_and_Count;

import java.util.Arrays;

public class sortAndCount {

    public static void main(String[] args) {
        String[] arrString = {"C", "B", "g", "h"};
        int counter = 0;
        for (int i = 0; i < arrString.length ; i++) {
            int leng = (arrString[i].length());
            char[] arrOfChars = new char[leng];
            for (char curr : arrString[i].toUpperCase().toCharArray()) {
                if (('A' <= curr && curr <= 'Z')) {
                    arrOfChars[counter] = curr;
                    counter++;
                }
            }
            Arrays.sort(arrOfChars);
            String sorted = new String(arrOfChars);
            char temp = 0;
            int dlina = sorted.length();
            for (char c = 'A'; c <= 'z'; c++) {
                int k = 0;
                for (int j = 0; j < dlina; j++) {
                    char ch = sorted.charAt(j);
                    if (ch == c) {
                        k++;
                    }
                }
                if (k > 0) {
                    String[] newChar = new String[k];

                    for (int d = 0; d < k; d++) {
                        newChar[d] = "#";
                    }

                    System.out.println("The character " + c + " has occurred for " + Arrays.toString(newChar) + " times");
                }
            }
        }

    }
}

