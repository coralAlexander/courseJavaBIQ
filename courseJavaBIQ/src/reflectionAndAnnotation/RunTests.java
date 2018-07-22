package reflectionAndAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RunTests {

	public static void main(String[] args) {
		
		int passed = 0, failed = 0;
		for (Method m : TestedClass.class.getDeclaredMethods()) {
			if (m.isAnnotationPresent(Test.class)) {
				try {
				    m.invoke(null,m.getAnnotation(Test.class).params());
					passed++;
				}

				catch (Throwable ex) {
					System.out.printf("Test %s failed: %s %n", m.getName(), ex.getCause());
					failed++;
				}
			}
		}
		System.out.printf("Passed: %d, Failed %d%n", passed, failed);
	}
}
