package ru.netology.javaqa.javaqamvn.service;

public class StatsService {

    public int getSum(int[] sales) {

        int findSum = 0;
        for (int i = 0; i < sales.length; i++) {
            findSum = findSum + sales[i];
        }
        return findSum; // Сумма всех продаж
    }

    public int getMediumSum(int[] sales) {

        int findSum = getSum(sales);
        int month = sales.length;
        int findMediumSum = findSum / sales.length;
        return findMediumSum; // Средняя сумма продаж в месяц
    }

    public int getMaxMonth(int[] sales) {

        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1; // Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    }

    public int getMinMonth(int[] sales) {

        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1; // Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    }

    public int monthsBelowMedium(int[] sales) {

        int findMediumSum = getMediumSum(sales);
        int monthBelowMedium = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < findMediumSum) {
                monthBelowMedium = monthBelowMedium + 1;
            }
        }
        return (monthBelowMedium); // Количество месяцев, в которых продажи были ниже среднего
    }

    public int monthsHigherMedium(int[] sales) {

        int findMediumSum = getMediumSum(sales);
        int monthsHigherMedium = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > findMediumSum) {
                monthsHigherMedium = monthsHigherMedium + 1;
            }
        }
        return (monthsHigherMedium); // Количество месяцев, в которых продажи были выше среднего
    }
}