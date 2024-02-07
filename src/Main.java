public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int percent = 12;
        int month = 0;
        int totalFinish = 2_459_000;
        double total = 0;
        int salary = 15_000;
        while (total <= totalFinish) {
            total = total + salary;
            total = total + total / 100 * 12 / percent;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");

        System.out.println("Задание 2");
        int start = 0;
        while (start < 10) {
            start++;
            System.out.print(start + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("Задание 3");
        int peopel = 12_000_000;
        int born = 17;
        int death = 8;
        int years = 10;
        int god = 0;
        int def;
        while (years > 0) {
            god++;
            years--;
            def = born - death;
            peopel = peopel + peopel / 1000 * def;
            System.out.println("Год " + god + ", численность населения составляет " + peopel);
        }

        System.out.println("Задание 4");
        int percentMonth = 7;
        int sumFinish = 12_000_000;
        double sum = 15_000;
        int monthStart = 0;
        while (sum <= sumFinish) {
            monthStart++;
            sum = sum + sum / 100 * percentMonth;
            System.out.println("Месяц " + monthStart + ", сумма накоплений " + sum);
        }

        System.out.println("Задание 5");
        int percentInMonth = 7;
        int totalStop = 12_000_000;
        double sumStart = 15_000;
        int monthOne = 0;
        while (sumStart <= totalStop) {
            monthOne++;
            sumStart = sumStart + sumStart / 100 * percentInMonth;
            if (monthOne % 6 == 0) {
                System.out.println("Месяц " + monthOne + ", сумма накоплений " + sumStart);
            }
        }

        System.out.println("Задание 6");
        int startPercent = 7;
        int yearsFinish = 9;
        double sumTotal = 15_000;
        int startMonth = 0;
        int monthFinish = yearsFinish * 12;
        while (startMonth <= monthFinish) {
            startMonth++;
            sumTotal = sumTotal + sumTotal / 100 * startPercent;
            if (startMonth % 6 == 0) {
                System.out.println("Месяц " + startMonth + ", сумма накоплений " + sumTotal);
            }
        }

        System.out.println("Задание 7");
        int dayFinish = 31;
        int day = 1;
        do {
            System.out.println("Сегодня пятница " + day + "-е число. Необходимо подготовить отчет.");
            day = day + 7;
        }
        while (day < dayFinish);

        System.out.println("Задание 8");
        int year = 2024;
        int period = 79;
        int periodStart = year - 200;
        int periodFinish = year + 100;
        while (periodStart < periodFinish) {
            periodStart += 1;
            if (periodStart % period == 0)
                System.out.println(periodStart + " -год пролета кометы над землей.");
        }
    }
}