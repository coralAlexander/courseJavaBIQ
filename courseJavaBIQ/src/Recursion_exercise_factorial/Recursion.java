package Recursion_exercise_factorial;

class Recursion {

    public static void main(String args[]) {
       
        Factorial fact = new Factorial();

        System.out.println("Факториал 5 равен " + fact.fact(5));
        System.out.println("Факториал 10 равен " + fact.fact(10));
        System.out.println("Факториал 12 равен " + fact.fact(12));
        System.out.println("Факториал 15 равен " + fact.fact(15));

    }
}