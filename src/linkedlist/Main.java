package linkedlist;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(13);
        list.add(7);
        list.add(13);
        list.add(13);
        list.add(3);
        list.add(13);
        System.out.println(list);

        // task1
//        list.remove(3);
//        System.out.println(list);

        // task2
//        list.removeAll(13);
//        System.out.println(list);

        MyList list2 = new MyList();
        System.out.println(list2);

        list2.add(3);
        System.out.println(list2);
    }
}
