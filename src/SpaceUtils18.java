/*
Создай класс с именем SpaceUtils.
В этом классе создай следующие константы и сразу проинициализируй их значениями:

PLANET_COUNT типа int со значением 8;
HOME_PLANET_NAME типа String со значением "Earth";
HOME_STAR_NAME типа String со значением "Sun"
Также создай в этом классе публичные статические методы:

String pluralPlanets(int planetCount).
Параметр planetCount может быть от 1 и больше. Если параметр planetCount равен 1, то возвращается строка "1 planet".
Если же параметр planetCount больше 1, то возвращаем строку "X planets", где вместо X - значение planetCount.
String generateStartMessage(String shipName, String time). Возвращает строку вида "Ship <shipName> start at <time>".
Вместо <ship> и <time> подставляются значения переменных shipName и time.
 */

public class SpaceUtils18 {
    public static final int PLANET_COUNT = 8;
    public static final String HOME_PLANET_NAME = "Earth";
    public static final String HOME_STAR_NAME = "Sun";

    public static String pluralPlanets(int planetCount){
        if (planetCount == 1){
            return "1 planet";

        }
        if (planetCount > 1){
            return planetCount + "planets";
        }
        return "ERROR";
    }

   static String generateStartMessage(String shipName, String time){
       return "Ship " +shipName+ " start at " +time;
   }
}
