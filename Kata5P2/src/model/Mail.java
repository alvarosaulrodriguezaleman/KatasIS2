package model;

public class Mail {
    String mail;

    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain() {
        if(!mail.contains("@")){
            return "";
        }
        return mail.substring(mail.indexOf("@"));
    }
}
