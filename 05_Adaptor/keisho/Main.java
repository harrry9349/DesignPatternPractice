public class Main{
    public static void main(String[] args){
        Print p = new PrintBanner("ABCDEFG");
        p.printWeak();
        p.printStrong();
        Print q = new PrintBanner("HIJKLMN");
        q.printNeutral();
    }
}