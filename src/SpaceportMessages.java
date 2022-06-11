//Задание
//Создай класс SpaceportMessages.
// В этом классе создай публичный статичный метод String generateLandingMessage(String shipName, String spaceport, String time),
// который принимает три параметра - название корабля, название космопорта, и время прилета корабля.
// Этот метод возвращает строку вида "Spaceship <shipName> landing at <spaceport>, time is <time>".
// Вместо <shipName>, <spaceport> <time> подставляются соответствующие параметры.
// Примеры тестов
//вызов SpaceportMessages.generateLandingMessage("SunFlower", "EarthKeeper", "20:40")
// возвращает строку "Spaceship Sunflower landing at EarthKeeper, time is 20:40"

public class SpaceportMessages {
    public static String generateLandingMessage(String shipName, String spaceport, String time) {
        return "Spaceship " + shipName + "landing at " + spaceport + ", time is " + time;
    }


    public static void main(String[] args) {
        System.out.println("Spaceship Sunflower landing at EarthKeeper, time is 20:40");
    }
}