class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumSum();
        FirTest firTest = new FirTest();

        //Should be 6
        System.out.println(firTest.test(firNum, 3));
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}
 /*
 Создай класс FirNumSum, который наследуется от класса FirNum.
 Переопредели у этого класса метод calc() так, чтобы он возвращал сумму чисел от 1 до переданного параметра n включительно.

Примеры тестов
вызов new FirNumSum().calc(3) возвращает 6
  */



class FirNumSum extends FirNum {

    @Override
    public int calc(int n) {
      int sum = 0;

        for (int i = 1; i <= n; i++) {
           sum = sum + i;
        }
        return sum;
    }
}
