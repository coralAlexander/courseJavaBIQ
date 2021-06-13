package memory;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.Scanner;

public class ClassLoadersExample {
    public static Object INSTANCE = null;

    public static void main(String[] args) throws Exception {
        loadClasses();
    }

    private static void loadClasses() throws Exception {
        URL url = new URL("file:" + System.getProperty("user.dir")+"/src/main/resources/jars/class.jar");
        ClassLoader customClassLoader = new URLClassLoader(new URL[]{url});
        Class loadedClassA = customClassLoader.loadClass("ClassA");

        // Try loading ClassLoadersExample by the custom class loader.
        // It will be loaded by the parent class loader (which is the App Class Loader).
        // This demonstrates the delegation mechanism
        Class loadedClassClassLoaderExample = customClassLoader.loadClass("learn.java.memory.ClassLoadersExample");

        // Create an instance of the loaded class from the JAR
        INSTANCE = loadedClassA.getDeclaredConstructor().newInstance();

        // String is loaded by the bootstrap class loader (class loader is null because it is implemented in native code)
        System.out.println("String Classloader: " + (String.class.getClassLoader() == null ? "Bootstrap Class Loader" : ""));

        // This class (ClassLoaderExample) CL is the application class loader
        // loadedClassClassLoaderExample is actually the same class instance as ClassLoaderExample
        System.out.println("ClassLoadersExample CL: " + ClassLoadersExample.class.getClassLoader());
        System.out.println("Loaded ClassLoadersExample CL: " + loadedClassClassLoaderExample.getClassLoader());
        System.out.println(ClassLoadersExample.class == loadedClassClassLoaderExample);

        // Class A is loaded by the Custom Class Loader
        System.out.println("Loaded Class A CL: " + loadedClassA.getClassLoader());

        System.out.println("Click any key to exit...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
