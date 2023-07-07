package ru.netology.services;

public class CalcWorkAndRelaxOfYear {
    public int calculate(int income, int expenses, int threshold) {
        int cuont = 0;                                        // счётчик месяцев отдыха
        int wallet = 0;                                       // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (wallet >= threshold) {                       // можем ли отдыхать?
                wallet -= expenses;
                wallet /= 3;
                cuont++;

            } else {
                wallet = wallet + income - expenses;         // сумма накопленных средств
            }
        }
        System.out.println("Месяцев отдыха: " + cuont);
        return cuont;
    }

}
