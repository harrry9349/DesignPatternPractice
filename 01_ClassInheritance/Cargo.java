class Cargo extends Plain {

    String getPlainName(){
        return "貨物機";
    }
    private int height = 0;
    void heightUp(int value){
        value = (value >= 0 ? value : 0);
        this.height += value;
        if(this.height > 18000){
            this.height = 18000;
            System.out.println("高度は18000より高くできません");
        }
        System.out.println(this.height);
    }

    void heightDown(int value){
        value = (value >= 0 ? value : 0);
        this.height -= value;
        if(this.height < 1000){
            this.height = 1000;
            System.out.println("高度は1000より低くできません");
        }
        System.out.println(this.height);
    }
}