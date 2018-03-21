package Recursion_Hanoi_Tower;

import java.util.Stack;

public class Pillar {
    private Stack<Integer> pillar = new Stack<>();
    public Pillar(int numOfDiscs) {
        for(int i=numOfDiscs; i>=1; --i) {
            pillar.push(i);
        }
    }

    public int take() {
        return pillar.pop();
    }

    public void put(int disc) {
        if(!pillar.isEmpty() && disc > pillar.peek()) {
            throw new RuntimeException("Cannot put disc " + disc + " on top of " + pillar.peek());
        }
        pillar.push(disc);
    }

    int size() {
        return pillar.size();
    }

    @Override
    public String toString() {
        return pillar.toString();
    }
}
