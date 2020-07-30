class Basket {
    private Fluit[] fruits;
    private int last = 0;
    protected int work = 0;
    public Basket(int max){
        this.fruits = new Fluit[max];
    }

    public getFruitAt(int index){
        return fruits[index];
    }

    public void appendFruit(Fruit fruit){
        this.fruits[last] = fruit;
        last++;
    }

    public int getLength(){
        return last;
    }

}