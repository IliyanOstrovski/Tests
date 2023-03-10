package com.company.Test5;
import java.util.ArrayDeque;
import java.util.Queue;

public class Average {
    private int n;
    private Queue<Integer> queue;
    private float sum;

    public Average(int n) {
        this.n = n;
        this.queue = new ArrayDeque<>();
        this.sum = 0;
    }

    public float next(int num) {
        queue.offer(num);
        sum += num;

        if (queue.size() > n) {
            sum -= queue.poll();
        }
        return (sum / queue.size());
    }

    public static void main(String[] args) {
        Average avg = new Average(3);
        float val;

        val = avg.next(1);
        System.out.println(val); // 1.0
        val = avg.next(2);
        System.out.println(val); // 1.5
        val = avg.next(3);
        System.out.println(val); // 2.0
        val = avg.next(4);
        System.out.println(val); // 3.0
        val = avg.next(5);
        System.out.println(val); // 4.0
        val = avg.next(0);
        System.out.println(val); // 3.0
    }
}
