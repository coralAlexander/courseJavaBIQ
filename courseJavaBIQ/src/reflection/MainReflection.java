package reflection;

public class MainReflection {

	public static void main(String[] args) {
		
		
		Person person = new Person();
		
        System.out.println(ReflectionUtils.toString(person));
	}

}
