package org.example.tasks;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

    private final List<Integer> localStorage;
    private final List<Integer> minValues;

    public MinStack() {
        localStorage = new ArrayList<>();
        minValues = new ArrayList<>();
    }

    public void push(int val) {
        localStorage.add(val);
        if(val < minValues.get(minValues.size()-1)) {
            minValues.add(val);
        }
    }

    public int pop() {
        var top = localStorage.get(localStorage.size() - 1);

        if(minValues.get(minValues.size() - 1) == top) {
            minValues.remove(minValues.size() - 1);
        }
        return top;
    }

    public int top() {
        return localStorage.remove(localStorage.size() - 1);
    }

    public int getMin() {
        return 0;
    }

}
