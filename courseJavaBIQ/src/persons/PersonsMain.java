package persons;

import java.util.Arrays;

public class PersonsMain {

    public static void main(String[] args) {
        Person[] persons = new Person[args.length];
        for(int i=0; i<args.length; ++i) {
            persons[i] = new Person(args[i]);
        }

        System.out.println(Arrays.toString(persons));
    }

}
