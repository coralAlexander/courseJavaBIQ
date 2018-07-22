package network_new_Encouding;

import java.io.DataInputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;

public class MainNetwork {

	public static void main(String[] args) {
		
		String line;
		try {
			URL u = new URL(URLEncoder.encode(args[0], "UTF-8"));
			
			DataInputStream htmlPage= new  DataInputStream(u.openStream());
			
			while((line= htmlPage.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
