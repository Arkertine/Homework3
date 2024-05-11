public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int а = 322223;
        byte b = 124;
        short c = 996;
        long d = 123456789L;
        float e = 246.135f;
        double f = 1.23456789;

        System.out.println("int а = " + а);
        System.out.println("byte b = " + b);
        System.out.println("short c = " + c);
        System.out.println("long d = " + d);
        System.out.println("float e = " + e);
        System.out.println("double f = " + f);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 2");
        float e1 = 27.12f;
        long d1 = 987_678_965_549L;
        float e2 = 2.786f;
        short c1 = 569;
        short c2 = -159;
        short c3 = 27897;
        byte b1 = 67;

        System.out.println("float e1 = " + e1);
        System.out.println("long d1 = " + d1);
        System.out.println("float e2 = " + e2);
        System.out.println("short c1 = " + c1);
        System.out.println("short c2 = " + c2);
        System.out.println("short c3 = " + c3);
        System.out.println("byte b1 = " + b1);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 3");
        int ludmilaClassStudentsAmount = 23;
        int annaClassStudentsAmount = 27;
        int ekaterinaClassStudentsAmount = 30;
        int paperAmount = 480;

        int allStudentsAmount = ludmilaClassStudentsAmount + annaClassStudentsAmount + ekaterinaClassStudentsAmount;
        int paperPerStudent = paperAmount / allStudentsAmount;
        System.out.printf("«На каждого ученика рассчитано %s листов бумаги».%n", paperPerStudent);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 4");
        int machineProductivityPerMinute = 16 / 2;
        System.out.printf("«За минуту машина произвела %s штук бутылок».%n", machineProductivityPerMinute);
        int machineProductivityPerTwentyMinutes = machineProductivityPerMinute * 20;
        System.out.printf("«За 20 минут машина произвела %s штук бутылок».%n", machineProductivityPerTwentyMinutes);
        int machineProductivityPerDay = machineProductivityPerMinute * 1440;
        System.out.printf("«За сутки машина произвела %s штук бутылок».%n", machineProductivityPerDay);
        int machineProductivityPerThreeDays = machineProductivityPerDay * 3;
        System.out.printf("«За 3 дня машина произвела %s штук бутылок».%n", machineProductivityPerThreeDays);
        int machineProductivityPerMonth = machineProductivityPerDay * 31;
        System.out.printf("«За месяц машина произвела %s штук бутылок».%n", machineProductivityPerMonth);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 5");
        int allCanAmount = 120;
        int whiteCanAmountPerClass = 2;
        int brownCanAmountPerClass = 4;
        int amountOfClasses = allCanAmount / (whiteCanAmountPerClass + brownCanAmountPerClass);
        double whiteCanAmount = whiteCanAmountPerClass * amountOfClasses;
        double brownCanAmount = brownCanAmountPerClass * amountOfClasses;
        System.out.printf("«В школе, где %s классов, нужно %s банок белой краски и %s банок коричневой краски».%n",
                amountOfClasses,
                whiteCanAmount,
                brownCanAmount);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 6");
        int bananasWeight = 80;
        int bananasForBreakfastWeight = bananasWeight * 5;
        int gramsInMilliliter = 105 / 100;
        int milkForBreakfastWeight = gramsInMilliliter * 200;
        int iceCreamWeight = 100;
        int iceCreamForBreakfastWeight = iceCreamWeight * 2;
        int eggsWeight = 70;
        int eggsForBreakfastWeight = eggsWeight * 4;

        int summaryWeight = bananasForBreakfastWeight + milkForBreakfastWeight + iceCreamForBreakfastWeight + eggsForBreakfastWeight;

        double summaryWeightInKilos = summaryWeight / 1000.0;
        System.out.printf("Вес завтрака в граммах = %s, вес завтрака в килограммах = %s.%n", summaryWeight, summaryWeightInKilos);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 7");
        int targetWeightInKilos = 7;
        int targetWeightInGrams = targetWeightInKilos * 1000;
        int lossWeightMin = 250;
        int lossWeightMax = 500;
        double daysAmountWithMin = targetWeightInGrams / lossWeightMin;
        double daysAmountWithMax = targetWeightInGrams / lossWeightMax;
        double averageDaysAmount = (daysAmountWithMin + daysAmountWithMax) / 2;
        System.out.println("Количество дней с похуданием по 250 грамм = " + daysAmountWithMin);
        System.out.println("Количество дней с похуданием по 500 грамм = " + daysAmountWithMax);
        System.out.println("Количество дней для похудания в среднем = " + averageDaysAmount);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 8");
        double salaryIncreasePersent = 1.1;
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        double yearMashaSalary = mashaSalary * 12;
        double yearDenisSalary = denisSalary * 12;
        double yearKristinaSalary = kristinaSalary * 12;

        double newMashaSalary = mashaSalary * salaryIncreasePersent;
        double newDenisSalary = denisSalary * salaryIncreasePersent;
        double newKristinaSalary = kristinaSalary * salaryIncreasePersent;

        double yearNewMashaSalary = newMashaSalary * 12;
        double yearNewDenisSalary = newDenisSalary * 12;
        double yearNewKristinaSalary = newKristinaSalary * 12;

        System.out.printf("«Маша теперь получает %s рублей. Годовой доход вырос на %s рублей»%n", newMashaSalary, yearNewMashaSalary - yearMashaSalary);
        System.out.printf("«Денис теперь получает %.1f рублей. Годовой доход вырос на %.1f рублей»%n", newDenisSalary, yearNewDenisSalary - yearDenisSalary);
        System.out.printf("«Кристина теперь получает %s рублей. Годовой доход вырос на %s рублей»%n", newKristinaSalary, yearNewKristinaSalary - yearKristinaSalary);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}