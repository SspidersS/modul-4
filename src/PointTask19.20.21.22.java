/*1.Напиши класс Point, описывающий точку в пространстве.
Создай у него три приватных поля типа int, с именами x, y и z.
Для каждого поля создай публичный сеттер и геттер.
Запусти код, и убедись, что созданные две точки (p1 и p2) хоть и имеют одинаковые координаты,
 но метод equals для них работает неправильно, и возвращает false.

 */
/*
2.Напиши в классе PointP метод hashCode(), который бы работал, как описано выше.
Можешь использовать Objects.hash() (тогда не забудь импортировать этот класс из пакета java.util)
 */
/*
3.Переопредели в классе PointP метод equals(),
чтобы вызов equals() для объектов класса Point с одинаковыми координатами возвращал true, и false,
если координаты отличаются. Обязательно допиши аннотацию @Override.
 */
/*
4.Напиши класс StarTrack. Объяви у этого класса два приватных поля типа Point с именами start и finish.
Напиши сеттеры и геттеры для этих полей.
Реализуй методы equals() и hashCode() для класса StarTrack.
Два объекта StarTrack считаются равны, если у них равны точки start и finish.
 */


import java.util.Objects;

class PointTest {
    public static void main(String[] args) {
        PointP p1 = new PointP();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        PointP p2 = new PointP();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        PointP p3 = new PointP();
        p3.setX(2);
        p3.setY(2);
        p3.setZ(3);

        System.out.println(p1.equals(p2)); //Should be true
        System.out.println(p1.equals(p3)); //Should be false
    }
}

  class PointP extends PointTest  {
    private int x;
    private int y;
    private int z;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public boolean equals (Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PointP point = (PointP) o;
        return this.x == point.getX()&& this.y == point.getY() && this.z == point.getZ();
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
  class starTrack extends PointP {
    private static PointP start;
    private static PointP finish;

      public PointP getStart() {
          return start;
      }

      public void setStart(PointP start) {
          this.start = start;
      }

      public PointP getFinish() {
          return finish;
      }

      public void setFinish(PointP finish) {
          this.finish = finish;
      }


  }

