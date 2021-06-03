package recursion_exercise_factorial;

class Recursion {

    public static void main(String args[]) {
        Factorial fact = new Factorial();
        System.out.println(" 5   " +  fact.fact(5));
        System.out.println(" 10  " +  fact.fact(10));
        System.out.println(" 12  " +  fact.fact(12));
        System.out.println(" 15  " +  fact.fact(15));
    }
}