package HomeworkNr12;

import LectureNr12.example1.FuelType;

public class AnotherMain {
    public static void main(String[] args) {
        System.out.println(FuelTypes.GASOLINE + " is Liquid:" + FuelTypes.GASOLINE.isLiquidFuel());
        System.out.println(FuelTypes.DIESEL  + " is Liquid:" + FuelTypes.DIESEL.isLiquidFuel());
        System.out.println(FuelTypes.CNG  + " is Liquid:" + FuelTypes.CNG.isLiquidFuel());
    }
}
