package ru.netology.javaqa.javaqamvn.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void findSum() {
        StatsService service = new StatsService();
        int[] sales = {
                16, 42, 86, 14, 55, 67, 11, 142, 17, 64, 5, 19
        };

        int expected = 538;
        int actual = service.getSum(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mediumSum() {
        StatsService service = new StatsService();
        int[] sales = {
                16, 42, 86, 14, 55, 67, 11, 142, 17, 64, 5, 19
        };

        int expected = 44;
        int actual = service.getMediumSum(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxMonth() {
        StatsService service = new StatsService();
        int[] sales = {
                16, 42, 86, 14, 55, 67, 11, 142, 17, 64, 5, 19
        };

        int expected = 8;
        int actual = service.getMaxMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMonth() {
        StatsService service = new StatsService();
        int[] sales = {
                16, 42, 86, 14, 55, 67, 11, 142, 17, 64, 5, 19
        };

        int expected = 11;
        int actual = service.getMinMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowMedium() {
        StatsService service = new StatsService();
        int[] sales = {
                16, 42, 86, 14, 55, 67, 11, 142, 17, 64, 5, 19
        };

        int expected = 7;
        int actual = service.monthsBelowMedium(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void higherMedium() {
        StatsService service = new StatsService();
        int[] sales = {
                16, 42, 86, 14, 55, 67, 11, 142, 17, 64, 5, 19
        };

        int expected = 5;
        int actual = service.monthsHigherMedium(sales);
        Assertions.assertEquals(expected, actual);
    }
}