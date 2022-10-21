import transort.Auto;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Auto lada;
        lada = new Auto("Lada",
                "Granta",
                1.7,
                "желтый",
                2015,
                "Россия",
                "механическая",
                "седан",
                "Р090ПР196",
                4,
                new Auto.Key(true,false),
                new Auto.Insurance(null, 457f, "768987678");

        Auto audi = new Auto("Audi ",
                "A8 50 L TDI quattro",
                3.0, "черный",
                2020,
                "Германия",
                "автоматическая",
                "седан",
                "Р157ПР196",
                4,
                new Auto.Key(true,false),
                new Auto.Insurance(null, 457f, "768987678");
        Auto bmv = new Auto("BMW",
                "Z8", 3.0,
                "черный",
                2021,
                "Германия",
                "автоматическая",
                "седан",
                "Р111ПР196",
                4,
                new Auto.Key(true,false),
                new Auto.Insurance(null, 457f, "768987678");
        Auto kia = new Auto("Kia ",
                "Sportage 4-го поколения",
                2.4, "красный",
                2018,
                "Южная Корея",
                "автоматическая",
                "седан",
                "Р511ПР196",
                4,
                new Auto.Key(true,false),
                new Auto.Insurance(null, 457f, "768987678");
        Auto hyundai = new Auto("Hyundai",
                null,
                1.6,
                "оранжевый",
                2016,
                "Южная Корея",
                "автоматическая",
                "седан",
                "Р777ПР196",
                4,
                new Auto.Key(true,false),
                new Auto.Insurance(null, 457f, "768987678");





        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmv);
        System.out.println(kia);
        System.out.println(hyundai);


    }
}