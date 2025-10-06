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
        if(minValues.isEmpty() || val < minValues.get(minValues.size()-1)) {
            minValues.add(val);
        }
    }

    public int pop() {
        var top = localStorage.get(localStorage.size() - 1);
        localStorage.remove(localStorage.size() - 1);
        if(minValues.get(minValues.size() - 1).equals(top)) {
            minValues.remove(minValues.size() - 1);
        }
        return top;
    }

    public int top() {
        return localStorage.remove(localStorage.size() - 1);
    }

    public int getMin() {
        return minValues.get(minValues.size() - 1);
    }

}

//SQL Query
//Customers
//id    name
//1     Joe
//2     Henry
//3     Sam
//4     Max

//Orders
//1     3
//2     1

//-----------------------
//Output
//Customers
//----------
//Henry
//Max

//==>
// select c.name as Customers
// from Customers c
// left join Orders o on c.id = o.customerId
// where c.customerId is null;
//
//
