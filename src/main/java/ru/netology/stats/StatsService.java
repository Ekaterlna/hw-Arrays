package ru.netology.stats;

public class StatsService {
    public long amountTotal(long[] sales) {
        long totalSales = 0; // сумма всех продаж

        for (int i = 0; i < sales.length; i++) {
            totalSales = totalSales + sales[i];
        }
        return totalSales;
    }


    public long averageMonthlySales(long[] sales) {
        long averageSale = 0; //средняя сумма продаж в месяц

        for (int i = 0; i < sales.length; i++) {
            averageSale = (averageSale + sales[i]);
        }
        averageSale = averageSale / sales.length;
        return averageSale;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int belowAverageSales(long[] sales) {
        int count = 0; // счетчик месяцев
        long averageSale = averageMonthlySales(sales); //средняя сумма продаж в месяц
        for (long sale : sales) {
            if (sale < averageSale) {
                count++;
            }
        }
        return count;
    }


    public int aboveAverageSales(long[] sales) {
        int count = 0; // счетчик месяцев //
        long averageSale = averageMonthlySales(sales); //средняя сумма продаж в месяц
        for (long sale : sales) {
            if (sale > averageSale) {
                count++;
            }
        }
        return count;
    }
}






