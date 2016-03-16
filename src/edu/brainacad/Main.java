package edu.brainacad;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by m18 on 16.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            Random random = new Random();
            int position = random.nextInt(list.size() + 1);

            list.add(position + "number" + i);

        }
        for (String a : list) {
            System.out.println(a);
        }
    }
}