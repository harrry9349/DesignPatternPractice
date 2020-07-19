public class Cellphone implements IPhone,IEmail{

    private String mailAddress;

    private String number;

    public Cellphone(String mailAddress,String number){
        this.mailAddress = mailAddress;
        this.number = number;
    }

    public void sendMail(String address){

        System.out.println("Send Email from " + this.mailAddress + " to " + address);
    }

    public void call(String number){
        System.out.println("Call from "  + this.number + " to " + number);
    }

}