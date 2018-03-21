package junit_basic;

public class Person {

    String name ;
    int age ;
    
    public Person( String name,int age) {
        this.name=name;
        this.age=age;
    }
    
    
    
    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }



    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Person && ((Person)o).name.equals(name));
  }
}