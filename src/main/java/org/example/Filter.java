package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int number : source) {
            if (number < treshold) {
                logger.log("Элемент " + number + " не подходит");
            } else {
                result.add(number);
                logger.log("Элемент " + number + " подходит");
            }
        }
        return result;
    }
}