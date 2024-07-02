package dev.bego;

import java.util.List;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        int n = 5;
        List<String> table = Multiplication.createTable(n);
        printMultiplicationTable(table);
    }

    
    public static void printMultiplicationTable(List<String> table) {
        for (String line : table) {
            System.out.println(line);
        }
    }
}
