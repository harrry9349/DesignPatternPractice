abstract class Plain {

    void takeOff(){
        System.out.println(this.getPlainName() + "が離陸しました");
    }

    void landing(){
        System.out.println(this.getPlainName() + "が着陸しました");
    }

    abstract void heightUp(int value);

    abstract void heightDown(int value);

    abstract String getPlainName();

}