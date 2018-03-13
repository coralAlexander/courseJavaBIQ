package atmWithEnum;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ATM {
  
	
    private static Map<Bill, Integer> bills2amount = new HashMap<>();

    public void add(Bill bill, int amount) {
        Integer currAmount = bills2amount.getOrDefault(bill, 0);
        bills2amount.put(bill, currAmount + amount);
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.add(Bill._20, 300);
    }

    public static Map<Bill,Integer> calcTotal() {
		Map<Bill,Integer> totalAmount =new HashMap<>();
    	
    	for (Entry<Bill, Integer> currBillSet : bills2amount.entrySet()) {
			
           int value  = currBillSet.getKey().getMonetaryValue();
           int amount = currBillSet.getValue();
           int total = value*amount;
           totalAmount.put(currBillSet.getKey(), total);
		}
    	
    	return bills2amount;	
    }
   
}
