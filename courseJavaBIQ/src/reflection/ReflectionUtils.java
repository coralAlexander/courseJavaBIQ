package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectionUtils {

	public static String toString(Object obj) {
		StringBuilder string = new StringBuilder();
		
		try {

			Field[] fields = obj.getClass().getDeclaredFields();

			for (Field field : fields) {
				field.setAccessible(true);
				string.append("  " + field.getName());
				Object val = field.get(obj);
				string.append("  " +val);
			}

		} catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		return string.toString();
	}

}
