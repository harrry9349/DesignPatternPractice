import java.util.*;

public class Main{
    public static void main(final String args[]) {

        final ArrayList<Plain> plains = new ArrayList<Plain>();

        plains.add(new Plain());
        plains.add(new Cargo());
        plains.add(new Jet());

        for (Plain plain : plains) {
            System.out.println(plain.getPlainName());
            plain.takeOff();
            plain.heightUp(10000);
            plain.heightUp(9000);

            plain.heightDown(2000);  
            plain.heightDown(50000);  
            plain.landing();
        }

    }
}