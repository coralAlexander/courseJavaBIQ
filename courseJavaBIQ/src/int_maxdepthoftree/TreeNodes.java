package int_maxdepthoftree;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TreeNodes {
    int val;
    TreeNodes left;
    TreeNodes right;

    public TreeNodes(){}

    public TreeNodes(int val) {
        this.val = val;
    }

    public TreeNodes(int val, TreeNodes left, TreeNodes right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
