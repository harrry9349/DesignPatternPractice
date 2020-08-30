public class Main{
    public static void main(String[] args){
        System.out.println("---開始---");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if(obj1 == obj2){
            System.out.println("obj1とobj2は同じクラスです。");
        }
        System.out.println("---終了---");
    }
}