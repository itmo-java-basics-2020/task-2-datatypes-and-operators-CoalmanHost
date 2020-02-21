package ru.itmo.java;

@SuppressWarnings("all")
public class Task2 {

    /**
     * Дано произвольное вещественное число. Выведите его дробную часть
     * <p>
     * Например
     * - дано 17.9
     * - вывод 0.9
     */
    double getFractionalPart(double realNumber)
    {
        return realNumber - (int)realNumber;
    }

    /**
     * Дан символ, верните его код. Не используйте явное приведение типов и любые библиотечные функции
     */
    int charCode(char c)
    {
        int code = c;
        return code;
    }

    /**
     * Даны 2 целых числа. Проверьте равны ли они
     */
    boolean testIfIntsEqual(Integer a, Integer b)
    {
        return (a != null && b != null) && (a.equals(b));
    }

    /**
     * Дано целое число. Выведите {@code true}, если оно входит в заданный диапазон или {@code false}
     * в иных случаях
     *
     * @param number      заданное число
     * @param leftBound   правая граница диапазона
     * @param rightBound  верхняя граница диапазона
     * @param inclusively входят ли границы в заданный даипазон
     */
    boolean numberInRange(Integer number, Integer leftBound, Integer rightBound, Boolean inclusively)
    {
        if
        (
                (number == null || leftBound == null || rightBound == null || inclusively == null)
                ||
                (
                (number != null && leftBound != null && rightBound != null && inclusively != null)
                &&
                ((((number < leftBound) || (number > rightBound)) && inclusively) || (((number <= leftBound) || (number >= rightBound)) && !inclusively))
                )
        )
        {
            return false;
        }
        return true;
    }

    /**
     * Даны 3 символа. Определите является ли хотя бы один из них цифрой 1..9
     */
    boolean atLeastOneIsDigit(char c1, char c2, char c3)
    {
        if (
                (c1 >= 48) && (c1 <= 57)
                ||
                (c2 >= 48) && (c2 <= 57)
                ||
                (c3 >= 48) && (c3 <= 57)
        )
        {
            return true;
        }
        return false;
    }

    /**
     * Даны два вещественных числа. Определите равны ли они
     */
    boolean areRealNumbersEqual(double a, double b)
    {
        double d = a - b;
        return d < 10e-15;
    }

    /**
     * Дано трехзначное число 100 <= N <= 999. Найдите сумму его чисел.
     */
    int sumOfDigits(int n)
    {
        if (n > 999 || n < 100)
        {
            return -1;
        }
        int val = n;
        int a = val % 10;
        val = (int)(val / 10);
        int b = val % 10;
        val = (int)(val / 10);
        int c = val % 10;
        val = (int)(val / 10);

        return a + b + c;
    }

    /**
     * Дано натуральное число N <= 10000. Выведите следующее после N четное число. Например: N = 8, Result = 10
     */
    int nextEvenNumber(int n)
    {
        return n + (2 - (n % 2));
    }

    /**
     * Школа №32 решила создать 3 дополнительных физмат класса и укомплектовать кабинеты новыми партами.
     * За одной партой может сидеть 2 ученика. Кол-во учеников в каждом из классов известно (num1, num2, num3).
     * Выведите минимальное кол-во парт, которые нужно приобрести школе, при условии что каждый из классов сидит в
     * своем кабинете
     */
    int schoolDesks(int num1, int num2, int num3)
    {
        return (num1 / 2) + (num1 % 2) + (num2 / 2) + (num2 % 2) + (num3 / 2) + (num3 % 2);
    }

    /**
     * Дано натуральное число N >= 10. Выведите результат применения XOR к последним 2-м цифрам числа N
     */
    int xorDigits(int N)
    {
        int val = N;
        int a = val % 10;
        val = val / 10;
        int b = val % 10;
        return a ^ b;
    }

}
