package dev.bego;

import java.util.ArrayList;
import java.util.List;

public class Multiplication {

    private static List<String> table = new ArrayList<>();
   
    public static List<String> createTable(int n) {         
        
         for (int i = 1; i <= 10; i++) {
            int result = n * i;
            String line = n + " x " + i + " = " + result;
            table.add(line);
        }

        return table;
    }
}
