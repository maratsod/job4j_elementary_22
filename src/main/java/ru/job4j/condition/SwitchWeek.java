package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "пн";
                break;
            case 2:
                name = "вт";
                break;
            case 3:
                name = "ср";
                break;
            case 4:
                name = "чт";
                break;
            case 5:
                name = "пт";
                break;
            case 6:
                name = "сб";
                break;
            case 7:
                name = "вс";
                break;
            default:
                name = "Ошибка";
                break;
        }
        return name;
    }
}
