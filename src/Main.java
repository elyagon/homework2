public class Main {
    public static void main(String[] args) {
        //Задание 1.2
        System.out.println("Задание 1.2");
        int age = 13;
        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием");
        }
        else {
            System.out.println("Возраст совершеннолетия еще не наступил, Вам нужно подождать");
        }
//Задание 2
        System.out.println("Задание 2");
        int yearsOld = 5;
        if (yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        else if (yearsOld >= 18 && yearsOld < 24) {
            System.out.println("Человек ходит в университет");
        }
        else if (yearsOld>=24){
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        //Задание 3
        System.out.println("Задание 3");
        int capacity = 102;
        int seat = 60;
        int standingPlace = capacity - seat;

        int usedSeats = 60;
        int otherUsed = 42;

        if (usedSeats < seat) {
            System.out.println("Есть еще " + (seat - usedSeats) + " сидячих мест");
        }
       else {
            System.out.println("Сидячих мест нет");
        }
        if (otherUsed < standingPlace) {
            System.out.println("Есть еще " + (standingPlace - otherUsed) + " стоячих мест");
        }

        else{
            System.out.println("Стоячих мест нет");
        }
    }
}