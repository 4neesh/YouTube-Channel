public class MailPerson {

    private MailEngine mailEngine;

    public MailPerson(MailEngine mailEngine) {
        this.mailEngine = mailEngine;
    }

    public void deliverMail(String address){
        if(address.contains("ABC")){
            this.mailEngine.send();
        }
        else if(address.contains("ABD")){
            MailEngine.sendMailToABD();
        }
        else{
            System.out.println("Invalid address");
        }
    }
}
