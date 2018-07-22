package file_Read_Write_To_Binary_and_Text_Files_Exam;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ATM  {

	
private static final long SerialVersionID = 1L;
	
	private String id;
	
	private Map<Bill, Integer> bills = new HashMap<>();
	
	public ATM() {}
	
	public ATM(String id) {
		this.id = id; }

	public Map<Bill,Integer> add(Bill bill , int amount){
		return bills;
	}	

	// binary
	public void save(FileOutputStream fos) throws IOException {
		try (DataOutputStream ds = new DataOutputStream(fos)) {
			ds.writeUTF(id);
			ds.writeInt(bills.size());
			for(Map.Entry<Bill, Integer> bill2amount : bills.entrySet()) {
				ds.writeInt(bill2amount.getKey().getMonetaryValue());
				ds.writeInt(bill2amount.getValue());
			}
		  }
        }
	
	public void load(FileInputStream fis) throws IOException {
		try (DataInputStream ds = new DataInputStream(fis)) {
			id = ds.readUTF();
			int size = ds.readInt(); // number of bill2amount
			for(int i=0; i<size; ++i) {
				int monetaryValue = ds.readInt();
				int amount = ds.readInt();
				//bills.put(Bill.getBill(monetaryValue), amount);
			}
	     }
	}
	
	// text
	public void saveAsTextFile(FileOutputStream fos) throws IOException {
		try (OutputStreamWriter writer = new OutputStreamWriter(fos)) {
			writer.write(id + '\n');
			writer.write("" + bills.size() + '\n');
			for(Map.Entry<Bill, Integer> bill2amount : bills.entrySet()) {
				writer.write("" + bill2amount.getKey().getMonetaryValue() + '\n');
				writer.write("" + bill2amount.getValue() + '\n');
			}
		}
	}
	
	public void loadFromTextFile(FileInputStream fis) throws IOException {
		bills.clear();
		try (InputStreamReader reader = new InputStreamReader(fis);
			     BufferedReader br = new BufferedReader(reader)) {
				id = br.readLine();
				int size = Integer.parseInt(br.readLine());
				for(int i=0; i<size; ++i) {
					int billMonetaryValue = Integer.parseInt(br.readLine());
					int amount = Integer.parseInt(br.readLine());
					//bills.put(Bill.getBill(billMonetaryValue), amount);
				}
			}		
	}
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof ATM) ) {
			return false;
		}
		ATM o = (ATM)other;
		return o.id.equals(id) && o.bills.equals(bills);
	}
}

