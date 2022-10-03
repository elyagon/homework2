import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int age = 6;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу");
        }

//Задание 2
        System.out.println("Задание 2");

        if (age < 5) {
            System.out.println("Ребенлк не млжет кататься на аттракционе.");
        } else if (age >= 5 && age < 14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Ребенок может кататься без сопровождения взрослого.");
        }
        //Задание 3
        System.out.println("Задание 3");
        int one = 117;
        int two = 117;
        int free = 117;
        if (one > two) {
            if (one > free) {
                System.out.println("Максимальное число - " + one);
            } else if (free > one) {
                System.out.println("Максимальное число - " + free);
            } else
                System.out.println("Числа" + one + " и " + free + "равны");
        } else if (two > one) {
            if (two > free) {
                System.out.println("Максимальное число - " + two);
            } else if (free > two) {
                System.out.println("Максимальное число - " + free);
            } else
                System.out.println("Числа" + two + " и " + free + "равны");
            System.out.println("Максимальное число - " + two);
        } else {
            if (one>free){
                System.out.println("Максимальное число - " + one);
            } else if (free>one){
                System.out.println("Максимальное число - " + free);
            } else {
                System.out.println("Все числа равны");
            }
    }
    }
}