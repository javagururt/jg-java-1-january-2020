package com.javaguru.lessons.lesson6;

class NumberService {

    int rangeSum(int from, int to) {
        if (from > to) {
            int temp = from;
            from = to;
            to = temp;
        }
        int sum = 0;
        while (from <= to) {
            sum = sum + from;
//            sum += from;
            from++;
        }
        return sum;
    }
}
