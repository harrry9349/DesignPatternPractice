class Fruit {
    private Color color;
    private String fruitname;
    public Fruit(String fruitname,String colorname){
        this.fruitname = fruitname;
        this.color = new Color(colorname);
    }

    public String getFruit(){
        return fruitname;
    }
}