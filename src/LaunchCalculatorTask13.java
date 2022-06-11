//Космопорт, с которого взлетают космические корабли, берет специальную плату за взлет. Эта плата зависит от количества пассажиров на корабле. Чем пассажиров больше, тем дороже взлет, потому что за страховки пассажиров отвечает именно космопорт.
//
//        У каждого космопорта свой алгоритм рассчета стоимости взлета.
//
//        Текущие формулы рассчета выглядят следующим образом:
//
//        космопорт JupiterStar берет фиксированную плату в 500 единиц и дополнительно по 2 единицы за каждого пассажира;
//        космопорт MercuryBeat не берет фиксированной платы за взлет, но берет по 15 единиц за каждого пассажира;
//        космопорт SunHeaven берет лишь фиксированную плату в 2000 единиц, но количество пассажиров при этом неограничено.
//        Нужно написать программу, которая принимает космопорт, количество пассажиров, и возвращает стоимость полета. Поскольку количество космопортов может расширяться, обойтись одним методом с if...else не получится, делать нужно расширяемо.
//
//        Поэтому нужно пойти по пути использования паттерна Стратегия.
//
//        У нас будет класс LaunchCalculator, у которого будет метод int calculateTotalPrice(Spaceport spaceport, int passengerCount). Он принимает два параметра - Spaceport (космопорт, из которого взлетаем), и passengerCount - количество пассажиров.
//
//        Но LaunchCalculator сам ничего не считает. Он просто переадресовывает всю работу объекту типа Spaceport, который и делает всю работу.
//
//        При таком подходе, если у нас появятся новые космопорты со сложной логикой рассчета стоимости, достаточно будет дописать новый наследник от класса Spaceport. Остальная часть программы не изменится.
//
//        Задача
//        Классы LaunchCalculator и абстрактный класс Spaceport уже написаны. Тебе нужно написать классы JupiterStar, MercuryBeat и SunHeaven, в которых будет зашита логика рассчета стоимости взлета ракеты.
//
//        Примеры тестов
//        Выполнение кода:
//
//        LaunchCalculator calculator = new LaunchCalculator();
//
//        int jupiterStarPrice = calculator.calculateTotalPrice(new JupiterStar(), 100);
//        System.out.println("JupiterStar price = " + jupiterStarPrice); //700
//
//        int mercuryBeatPrice = calculator.calculateTotalPrice(new MercuryBeat(), 100);
//        System.out.println("MercuryBeat price = " + mercuryBeatPrice); //1500
//
//        int sunHeavenPrice = calculator.calculateTotalPrice(new SunHeaven(), 100);
//        System.out.println("SunHeaven price = " + sunHeavenPrice); //2000
//        выведет в консоль:
//
//        JupiterStar price = 700
//        MercuryBeat price = 1500
//        SunHeaven price = 2000


class LaunchCalculator {
    public int calculateTotalPrice(Spaceport spaceport, int passengerCount) {
        return spaceport.calculateTotalPrice(passengerCount);
    }

    public static void main(String[] args) {
        LaunchCalculator calculator = new LaunchCalculator();

        int jupiterStarPrice = calculator.calculateTotalPrice(new JupiterStar(), 100);
        System.out.println("JupiterStar price = " + jupiterStarPrice); //700

        int mercuryBeatPrice = calculator.calculateTotalPrice(new MercuryBeat(), 100);
        System.out.println("MercuryBeat price = " + mercuryBeatPrice); //1500

        int sunHeavenPrice = calculator.calculateTotalPrice(new SunHeaven(), 100);
        System.out.println("SunHeaven price = " + sunHeavenPrice); //2000
    }
}

abstract class Spaceport {
    public abstract int calculateTotalPrice(int passengerCount);
}

class JupiterStar extends Spaceport {
    public int calculateTotalPrice ( int passengerCount){
        return 2* passengerCount + 500;
    }
}
 class MercuryBeat extends Spaceport{
    public int calculateTotalPrice (int  passengerCount){
        return 15*  passengerCount;
    }
 }
  class SunHeaven extends Spaceport{
    public int calculateTotalPrice (int passengerCount){
        return 2000;
    }
  }