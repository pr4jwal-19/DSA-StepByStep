package com.collectionframework;

import java.util.PriorityQueue;
import java.util.Stack;

public class StackExp {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(3);
        stack.push(4);
        System.out.println("Before pop: "+stack);
        stack.pop();
        System.out.println("After popping: "+stack);
        PriorityQueue<Integer> priorityQueue= new PriorityQueue<>();
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(5);
        priorityQueue.add(2);
        System.out.println("Priority Queue: "+priorityQueue);
        Integer peekedElem= priorityQueue.peek();
        System.out.println("Peeked elem: "+peekedElem);
        System.out.println(priorityQueue);
        priorityQueue.offer(3);
        System.out.println(priorityQueue);

    }
}
