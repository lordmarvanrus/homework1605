public class homework {

    public static void main(String[] args) {
        // 1 задание
        var j = 154;
        // целочисленные
        byte a = 127;
        short b = 32767;
        int c = 222;
        long d = 99999L;
        // с плавающей точкой
        float e = 1.15f;
        double f = 5.115;

        // 2 задание
        System.out.println("Задание 2");
        double firstBoxer = 78.2;
        double secondBoxer = 82.7;
        double boxersWeight = firstBoxer + secondBoxer;
        System.out.println("Общая масса двух бойцов составляет: " + boxersWeight + " кг");
        double weightDifference = secondBoxer - firstBoxer;
        System.out.println("Разница в массе бойцов составляет: " + weightDifference + " кг");

        // 3 задание
        System.out.println("Задание 3");
        int bananas = 5;
        int bananaWeight = 80;
        int icecream = 2;
        int icecreamWeight = 100;
        int eggs = 4;
        int eggWeight = 70;
        double milk = 200;
        double milkWeight = 105/100;
        // можно было бы принять кол-во молока за 2 и умножить на 105, но так интереснее
        double cocktailWeight = (bananas*bananaWeight) + (icecream*icecreamWeight) + (eggs*eggWeight) + (milk*milkWeight);
        double cocktailWeightKg = cocktailWeight/1000;
        System.out.println("Масса спортивного коктейля составляет " + cocktailWeightKg + " кг");

        // 4 задание
        System.out.println("Задание 4");
        int excessWeight = 7 * 1000;
        int weightLoss1 = 250;
        int weightLoss2 = 500;
        int days1 = excessWeight/weightLoss1;
        int days2 = excessWeight/weightLoss2;
        double averageDays = (days1+days2)/2;
        System.out.println("При потере веса 250 г потребуется " + days1 + " дней");
        System.out.println("При потере веса 500 г потребуется " + days2 + " дней");
        System.out.println("В среднем может потребоваться " + averageDays + " дней");

        // 5 задание
        System.out.println("Задание 5");
        int mPayment = 67760;
        int dPayment = 83690;
        int kPayment = 76230;
        double mPromotion = mPayment * 1.1;
        double dPromotion = dPayment * 1.1;
        double kPromotion = kPayment * 1.1;
        double mNewAnnualIncome = mPromotion * 12;
        double dNewAnnualIncome = dPromotion * 12;
        double kNewAnnualIncome = kPromotion * 12;
        double mDifference = mNewAnnualIncome - (mPayment * 12);
        double dDifference = dNewAnnualIncome - (dPayment * 12);
        double kDifference = kNewAnnualIncome - (kPayment * 12);
        System.out.println("Маша теперь получает " + mNewAnnualIncome + " рублей в год, что больше на " + mDifference + " рублей");
        System.out.println("Денис теперь получает " + dNewAnnualIncome + " рублей в год, что больше на " + dDifference + " рублей");
        System.out.println("Кристина теперь получает " + kNewAnnualIncome + " рублей в год, что больше на " + kDifference + " рублей");

        // я не понимаю почему в итоге он показывает денису 1104708.0000000002 откуда эти копейки берутся? он скрепки продает из офиса?
    }
}