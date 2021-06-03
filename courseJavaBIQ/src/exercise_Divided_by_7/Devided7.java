package exercise_Divided_by_7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Devided7 {

    public static void main(String[] args) {
        String str[] = {"1 ", "7", "21", "66", "151546565"};
        /*int integer[] = new int[10];
        integer[1] = 6 ;
        int size = integer.length;
        int  igggg = integer[1];*/
        int expected = 7;
        divided7(str,expected);
    }

    public static void divided7(String[] str , int expected) {
        int upnum;
        for (String curr : str) {
            String updatedString = curr.replace(" ", "");
            upnum = Integer.parseInt(updatedString);
            int nn = upnum;
            while (upnum > 0) {
                if (upnum % expected == 0 || upnum % 10 == expected) {
                    System.out.println("Divide " + expected + " : " + nn);
                    break;
                } else {
                    int n = upnum / 10;
                    upnum = n;
                }
            }
        }
    }
}

	
