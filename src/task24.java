//1000 звезд записывается символом X;
//  100 звезд записывается символом Y;
//  10 звезд записывается символом Z;
//  1 звезда записывается символом *.
//        Таким образом, любое число звезд можно перевести в такую понятную всем участникам гильдии запись.
//
//        Несколько примеров:
//
//        1001 звезда - это X*;
//    576 звезд - это YYYYYZZZZZZZ******
// Нужно использовать минимальное число символов. То есть, например, 101 звезду нужно представить в виде Y*, но не в виде ZZZZZZZZZZ*.


class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }

    @Override
    public String toString() {
        int bill = getCount();
        int x = bill / 1000;             // 2
        bill = bill - x * 1000;       // 2532 - x*1000 = 532
        int y = bill / 100;              // 532 / 100 = 5
        bill = bill - y * 100;       //  32
        int z = bill / 10;               // 532 - y*100 = 32
        bill = bill - z * 10;        // 2
        int v = bill;
        
        String string = "";
        for (int i = 0; i < x; i++) {
            string += "X";
        }
        for (int i = 0; i < y; i++) {
            string += "Y";
        }
        for (int i = 0; i < z; i++) {
            string += "Z";
        }
        for (int i = 0; i <v; i++) {
            string += "*";
        }
        return string;
    }

}
