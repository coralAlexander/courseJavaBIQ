package iterator_stack_With_Iterator;

import java.util.Iterator;

public class MyStackIterator implements Iterator<Integer> {
    private int [] st;
    private int pointer;

    public MyStackIterator(int [] st, int pointer) {
        this.st = st;
        this.pointer=pointer;

    }
    @Override
    public boolean hasNext() {
        return pointer > 0;
    }

    @Override
    public Integer next() {
        return st[--pointer];
    }
}
