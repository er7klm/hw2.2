package com.company;

public class Main {

    public static void main(String[] args) {
        int age = (int) ( Math.random() * 95 );
        int temperature = (int) ( Math.random() * 60 );
        System.out.println("Вам: "+ age + " лет");
        System.out.println("Сейчас: "+ temperature + " градусов Цельсия");

        if ((age >= 20 && age <= 45) && (temperature > -20 && temperature < 30)) {
            System.out.println("Можно идти гулять");
            System.out.println();
        }

        if (age < 20 && (temperature >= 0 && temperature <= 28)) {
            System.out.println("Можно идти гулять");
            System.out.println();
        }

        if ((age > 45) && (temperature > -10 && temperature < 25)) {
            System.out.println("Можно идти гулять");
            System.out.println();
        } else {
            System.out.println("Оставайтесь дома!");
            System.out.println();
        }

    }
}
