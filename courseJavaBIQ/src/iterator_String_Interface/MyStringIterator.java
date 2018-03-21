package iterator_String_Interface;

import java.util.Iterator;

class MyStringIterator implements Iterator<Character> {

    private final String str;
    private int pos = -1;

    public MyStringIterator(String str) {
        this.str = str;
    }
  
    public boolean hasNext() {
        return pos+1 < str.length();
    }

    public Character next() {
        return str.charAt(++pos);
    }

}