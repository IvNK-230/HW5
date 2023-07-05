package ru.netology.services;
public class CalcWorkAndRelaxOfYear {
    public int calculate(int income, int expenses, int threshold) {
        int cuont = 0;                                        // счётчик месяцев отдыха
        int money = 0;                                        // колличество средств перед отпуском
        int wallet = 0;                                       // количество денег на счету
        int rest = 0;                                         // сумма расходов в отпуске

        for (int month = 0; month < 12; month++) {
            if (wallet >= threshold) {                       // можем ли отдыхать?
                money = wallet;                              // передаём сумму средств перед отпуском
                rest = wallet * 2;                           // сумма средств потраченных в отпуске
                wallet = (wallet - expenses) / 3;            // оставшиеся средства после опуска
                System.out.println("Месяц " + (month + 1) + ". Денег " + money + ". Буду отдыхать. Потратил - " + expenses + ", затем еще " + rest);
                cuont++;

            } else {
                System.out.println("Месяц " + (month + 1) + ". Денег " + wallet + ". Придется работать. Заработал + " + income + ", потратил -" + expenses);
                wallet = wallet + income - expenses;         // сумма накопленных средств
            }
        }
        System.out.println("Месяцев отдыха: " + cuont);
        return cuont;
    }

}
