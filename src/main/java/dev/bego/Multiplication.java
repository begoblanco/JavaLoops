package dev.bego;

import java.util.ArrayList;
import java.util.List;

public class Multiplication {
   
    public static List<String> createTable(int n) {   
        List<String> table = new ArrayList<>();      
        
         for (int i = 1; i <= 10; i++) {
            int result = n * i;
            String line = n + " x " + i + " = " + result;
            table.add(line);
        }

        return table;
    }
}
