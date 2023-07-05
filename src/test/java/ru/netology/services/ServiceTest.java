package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvFileSource;
//import org.junit.jupiter.params.provider.CsvSource;

public class ServiceTest {
    @Test
    void sholdCalculeteTheNumberOfMonthsOfRelax1() {
        CalcWorkAndRelaxOfYear service = new CalcWorkAndRelaxOfYear();

          int income = 10_000;                // Доход в месяц
          int expenses = 3_000;               // Расходы в месяц
          int threshold = 20_000;             // Сумма необходимая для отдыха
          int expected = 3;                   // Ожидаемый результат

        // вызываем целевой метод:
        long actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sholdCalculeteTheNumberOfMonthsOfRelax2() {
        CalcWorkAndRelaxOfYear service = new CalcWorkAndRelaxOfYear();

        int income = 100_000;                // Доход в месяц
        int expenses = 60_000;               // Расходы в месяц
        int threshold = 150_000;             // Сумма необходимая для отдыха
        int expected = 2;                    // Ожидаемый результат

        // вызываем целевой метод:
        long actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

}
