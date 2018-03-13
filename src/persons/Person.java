package persons;

import java.util.ArrayList;
import java.util.Date;

public class Person {

    // fields
    private String name;
    private Date birthDate = new Date();
    private ArrayList<String> namesHistory = new ArrayList<>();

    // ctors
    public Person(String name) {
        setName(name);
    }

    public void setName(String name) {
        if (!name.equals(this.name)) {
            namesHistory.add(name);
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return name + " birth date: " + birthDate;
    }
}
