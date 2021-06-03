package int_remove_duplicates_from_sorted_list;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ListNode {

    int val;
    ListNode next;

    ListNode(){}

    ListNode(int val){
        this.val = val;
    }
}
