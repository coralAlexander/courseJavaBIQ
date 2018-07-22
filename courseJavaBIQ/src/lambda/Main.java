package lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		
        /*Runnable runnable = () -> staticMethod();
        new Thread(runnable).start();
        
        List<String> strings = new LinkedList<>();
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");

        strings.forEach(x -> System.out.println(x));*/
        
        
        Stream<String> streamFromFiles = Files.lines(Paths.get("C:\\ForTest\\test.txt"));
        int count = (int) streamFromFiles.parallel().count();
       // System.out.println(count);
        
        ArrayList<String> list = new ArrayList<>();
        //list.stream()
          List  numbers = Arrays.asList(1, 2, 3, 4);
        
        //numbers.stream().collect(Collectors.summingInt(((p) -> p % 2 == 1? p: 0)));
          
        List strings =  Arrays.asList("a1", "b3", "c2", "a1");
       System.out.println(strings.stream().distinct().collect(Collectors.toList())); 
       
     //  System.out.println(strings.stream().distinct().map(String::toUpperCase).toArray(String[]::new));
    }

    private static void staticMethod() {
        System.out.println("Я - метод staticMethod(), и меня только-что кто-то вызвал!");
    }

}
