package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/examples.csv")
    public void sholdCalculeteTheNumberOfMonthsOfRelax1(int income, int expenses, int threshold, int expected) {
        CalcWorkAndRelaxOfYear service = new CalcWorkAndRelaxOfYear();

        long actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    void sholdCalculeteTheNumberOfMonthsOfRelax2() {
//        CalcWorkAndRelaxOfYear service = new CalcWorkAndRelaxOfYear();
//
//        int income = 100_000;                // Доход в месяц
//        int expenses = 60_000;               // Расходы в месяц
//        int threshold = 150_000;             // Сумма необходимая для отдыха
//        int expected = 2;                    // Ожидаемый результат
//
//        // вызываем целевой метод:
//        long actual = service.calculate(income, expenses, threshold);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        Assertions.assertEquals(expected, actual);
//    }

}
