class RocketLauncher {
    private String size;
    private int rocketCount;
//    Метод toString класса RocketLauncher для объекта RocketLauncher{size=huge, rocketCount=894}
//    возвращает неправильное значение RocketLauncher{size='huge', rocketCount=894} ,
//    а должен возвращать Size is huge, rocket count is 894
    @Override
    public String toString() {
        return "Size is " +size+ ", rocket count is " +rocketCount+
                "";
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getRocketCount() {
        return rocketCount;
    }

    public void setRocketCount(int rocketCount) {
        this.rocketCount = rocketCount;
    }

    public static void main(String[] args) {
        RocketLauncher launcher = new RocketLauncher();
        launcher.setSize("big");
        launcher.setRocketCount(50);

        //Should be - Size is big, rocket count is 50
        System.out.println(launcher);
    }
}