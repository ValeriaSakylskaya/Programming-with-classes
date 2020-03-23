package com.task;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
        столицу, количество областей, площадь, областные центры. */
        City cityMinsk = new City("Minsk");
        City cityMogilev = new City("Mogilev");
        City cityBobruisk = new City("Bobruisk");
        City cityGomel = new City("Gomel");
        City cityBrest = new City("Brest");
        District districtMinsk = new District("Minsk", 20.56, cityMinsk);
        District districtMogilev = new District("Mogilev", 20.56, cityMogilev);
        District districtBobruisk = new District("Bobruisk", 20.56, cityBobruisk);
        District districtGomel = new District("Gomel", 20.56, cityGomel);
        District districtBrest = new District("Brest", 20.56, cityBrest);
        Region minsk = new Region("Minsk", 200.56, districtMinsk);
        minsk.addDistrict(districtMinsk);
        Region mogilev = new Region("Mogilev", 100.56, districtMogilev);
        mogilev.addDistrict(districtMogilev);
        mogilev.addDistrict(districtBobruisk);
        Region gomel = new Region("Gomel", 100.56, districtGomel);
        gomel.addDistrict(districtGomel);
        Region brest = new Region("Brest", 100.56, districtBrest);
        brest.addDistrict(districtBrest);
        Country belarus = new Country("Belarus", 560.25, minsk);
        belarus.addRegion(minsk);
        belarus.addRegion(mogilev);
        belarus.addRegion(gomel);
        belarus.addRegion(brest);
        belarus.displayCapital();
        belarus.displayCountRegion();
        belarus.displaySquare();
        belarus.displayRegionCenter();
    }
}
