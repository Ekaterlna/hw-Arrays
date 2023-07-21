package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    long[] sales = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
    };

    @Test
    public void sumOfAllSales() {
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.amountTotal(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageMonthlySales() {
        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.averageMonthlySales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMonthNumberMaxSales() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMonthNumberMinSales() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numbersOfMonthsOfSalesBelowAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.belowAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numbersOfMonthsOfSalesAboveAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.aboveAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}
