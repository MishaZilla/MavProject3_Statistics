package ru.netology.javaqa.javaqamvn.service;

public class StatsService {

    public long getSum(long[] sales) {

        long findSum = 0;
        for (int i = 0; i < sales.length; i++) {
            findSum = findSum + sales[i];
        }
        return findSum; // Сумма всех продаж
    }

    public long getMediumSum(long[] sales) {

        long findSum = getSum(sales);
        long month = sales.length;
        long findMediumSum = findSum / sales.length;
        return findMediumSum; // Средняя сумма продаж в месяц
    }

    public long getMaxMonth(long[] sales) {

        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1; // Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    }

    public long getMinMonth(long[] sales) {

        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1; // Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    }

    public long monthsBelowMedium(long[] sales) {

        long findMediumSum = getMediumSum(sales);
        long monthBelowMedium = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < findMediumSum) {
                monthBelowMedium = monthBelowMedium + 1;
            }
        }
        return (monthBelowMedium); // Количество месяцев, в которых продажи были ниже среднего
    }

    public long monthsHigherMedium(long[] sales) {

        long findMediumSum = getMediumSum(sales);
        long monthsHigherMedium = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > findMediumSum) {
                monthsHigherMedium = monthsHigherMedium + 1;
            }
        }
        return (monthsHigherMedium); // Количество месяцев, в которых продажи были выше среднего
    }
}