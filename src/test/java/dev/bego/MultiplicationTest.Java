package dev.bego;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

public class MultiplicationTest {

    @Test
    void testCreateTable() {
        int n = 5;
        List<String> table = Multiplication.createTable(n);

        List<String> expected = List.of(
            "5 x 1 = 5",
            "5 x 2 = 10",
            "5 x 3 = 15",
            "5 x 4 = 20",
            "5 x 5 = 25",
            "5 x 6 = 30",
            "5 x 7 = 35",
            "5 x 8 = 40",
            "5 x 9 = 45",
            "5 x 10 = 50"
        );

        assertEquals(expected, table);
    }

    @Test
    void testTableSizeIsTen() {
        int n = 5;
        List<String> table = Multiplication.createTable(n);
        assertEquals(10, table.size());
    }

}