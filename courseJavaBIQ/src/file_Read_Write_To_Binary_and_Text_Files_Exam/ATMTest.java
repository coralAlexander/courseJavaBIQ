package file_Read_Write_To_Binary_and_Text_Files_Exam;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ATMTest {

private ATM atm1 = new ATM("123");
	
	@Before
	public void init() {
		atm1.add(Bill._20, 5);
		atm1.add(Bill._50, 10);
	}
	@Ignore
	@Test
	public void testSaveLoadWithSerialization() throws IOException, ClassNotFoundException {
		// save with Serialization
		
		try (FileOutputStream fos = new FileOutputStream("c:\\test\\atm_test1.bin");
			ObjectOutputStream s = new ObjectOutputStream(fos)) {
				s.writeObject(atm1);
		}
		// load with Serialization
		ATM atm2 = null;
		try (FileInputStream fis = new FileInputStream("c:\\test\\atm_test1.bin");
			ObjectInputStream s = new ObjectInputStream(fis)) {
				atm2 = (ATM)s.readObject();
		}
		assertEquals(atm1, atm2);
	}
	@Test
	public void testSaveLoadWithOurTextFormat() throws IOException {
		// save
		
		try (FileOutputStream fos = new FileOutputStream("c:\\test\\atm_test1.bin")) {
			atm1.saveAsTextFile(fos);
		}
		// load
		ATM atm2 = new ATM();
		try (FileInputStream fis = new FileInputStream("c:\\test\\atm_test1.bin")) {
			atm2.loadFromTextFile(fis);
		}
		assertEquals(atm1, atm2);
	}
	
}
