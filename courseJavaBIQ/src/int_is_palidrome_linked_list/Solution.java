package int_is_palidrome_linked_list;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {


    }

    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<>();
        ListNode currentNode = head;

        while (currentNode != null){
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        List<Integer> reversedVals = new ArrayList<>();

        for (int i = vals.size() -1 ; i >= 0 ; i--){
            reversedVals.add(vals.get(i));
        }

        for (int i = 0 ; i < vals.size() - 1 ; i ++){
            if (vals.get(i) != reversedVals.get(i)){
                return false;
            }
        }
      return true;
    }
}


// Time O(N)
// Space O(N)