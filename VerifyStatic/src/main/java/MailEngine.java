public class MailEngine {

    public void send(){
        System.out.println("Send non static");
    }

    public static void sendMailToABD(){
        System.out.println("Static sending to ABD");
    }
}
