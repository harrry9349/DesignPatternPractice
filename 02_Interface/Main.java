import java.util.*;

public class Main{

    public static void main(String args[]){
        Cellphone cp = new Cellphone("hoge@email.com","090-0000-0000");
        cp.call("011-1111-1111");
        cp.sendMail("fuga@email.com");

        IPhone phone = (IPhone)cp;
        phone.call("011-987-6543");
    //  phone.sendMail("foo@email.com");  コンパイルエラー
        IEmail mail = (IEmail)cp;

        mail.sendMail("bar@email.com");
    //mail.call("011-222-3333");　　　　　　コンパイルエラー


    }



}