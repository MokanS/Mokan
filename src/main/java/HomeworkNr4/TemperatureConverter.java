package HomeworkNr4;

public class TemperatureConverter {
    static double toFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {

        double fahrenheit = toFahrenheit(25);
        System.out.println("25 градусов Цельсия = " + fahrenheit + " градусов Фаренгейта");

        double celsius = toCelsius(68);
        System.out.println("68 градусов Фаренгейта = " + celsius + " градусов Цельсия");
    }
}

