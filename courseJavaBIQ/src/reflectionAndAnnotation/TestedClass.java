package reflectionAndAnnotation;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.concurrent.SynchronousQueue;

public class TestedClass {

	@Test(params = {"A-1"}) 
	public static void m1(String s ) {	
	 	
	 System.out.println(s);
		
	}
	
	
	
	/*public static void m2() {}
	
	@Test(params = { "" }) public static void m3() {
		throw new RuntimeException("Boom");
	}*/
}
