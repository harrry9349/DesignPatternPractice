class Jet extends Plain {

    String getPlainName(){
        return "ジェット機";
    }
    private int height = 0;

    void heightUp(int value){
        value = (value >= 0 ? value : 0);
        this.height += value;
        if(this.height > 36000){
            this.height = 36000;
            System.out.println("高度は"+this.height+"より高くできません");
        }
        System.out.println(this.height);
    }

    void heightDown(int value){
        value = (value >= 0 ? value : 0);
        this.height -= value;
        if(this.height < 3000){
            this.height = 3000;
            System.out.println("高度は"+this.height+"より低くできません");
        }
        System.out.println(this.height);

    }

}