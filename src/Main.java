public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Auto auto2 = new Auto("Audi ", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Auto auto3 = new Auto("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Auto auto4 = new Auto("Kia ", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Auto auto5 = new Auto("Hyundai", null, 1.6, "оранжевый", 2016, "Южная Корея");

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
        System.out.println(auto4);
        System.out.println(auto5);


    }
}
//