package generic_stack;

public class Main {

    public static void main(String[] args) throws Exception {
        MyStack<String> s = new MyStack<String>(2);
        try {
			s.push("Four");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			s.push("Two");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        System.out.println(s.pop()); // 2
        String str = s.pop();
        System.out.println(str); // 4
        try {
            System.out.println(s.pop()); // exception
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        MyStack<Integer> istack = new MyStack<>(3);
        istack.push(4);
        istack.push(2);
        System.out.println(istack.pop()); // 2
        int i = istack.pop();
        System.out.println(i); // 4
        try {
            System.out.println(istack.pop()); // exception
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

}
