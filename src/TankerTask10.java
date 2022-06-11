//Напиши класс Tanker, у которого есть:
//
//приватное поле serialNumber строкового типа, геттер и сеттер для этого поля;
//метод protected String getFuelType(), который возвращает строку "A500" - базовый вид топлива;
//метод public void refuel(int amount). Он принимает целое число - количество топлива, которое заправляем, и печатает строку вида - "Add <AMOUNT> of <FUEL TYPE>, tanker serial number is <SERIAL NUMBER>". Вместо <AMOUNT> подставь значение параметра amount, вместо <FUEL TYPE> - значение getFuelType(), вместо <SERIAL NUMBER> - значение поля serialNumber.
//Напиши класс XFuelTanker, у которого переопредели метод getFuelType(). Этот метод должен возвращать строку "XFuel".
//
//Напиши класс MX200Tanker, у которого переопредели метод getFuelType(). Этот метод должен возвращать строку "MX200".


class XFuelEngine extends TankerTask10 {
    @Override
    public String getFuelType(){
        return "XFuel";
    }

}

class TankerTask10 {
    private int power;


    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getFuelType() {
        return "A500";
    }

    public static void main(String[] args) {
        TankerTask10 basicEngine = new TankerTask10();
        System.out.println(basicEngine.getFuelType()); //A500

        TankerTask10 xFuelEngine = new XFuelEngine();
        System.out.println(xFuelEngine.getFuelType()); //XFuel
    }

}
