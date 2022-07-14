
package vaccinedistribution.email;

import java.util.Properties;

import com.sun.mail.util.MailSSLSocketFactory;
import java.security.GeneralSecurityException;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEMail {
    static String from = "systemvaccinedistribution@gmail.com";
    static final String username = "systemvaccinedistribution@gmail.com";
    static final String password = "vaccine123";
    static final String host="smtp.gmail.com";
    
    public static void AcceptMail(String to){
        try {
        MailSSLSocketFactory sf = new MailSSLSocketFactory();
                sf.setTrustAllHosts(true);
                Properties props = new Properties();
                props.put("mail.imap.ssl.trust", "*");
                props.put("mail.imap.ssl.socketFactory", sf);
                props.put("mail.smtp.auth", true);
                props.put("mail.smtp.starttls.enable",true);
                props.put("mail.smtp.host", host);
                props.put("mail.smtp.port", 587);
        Session session = Session.getInstance(props,
         new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication(username, password);
	   }
         });
	   Message message = new MimeMessage(session);
	   message.setFrom(new InternetAddress(from));
	   message.setRecipients(Message.RecipientType.TO,
           InternetAddress.parse(to));
	   message.setSubject("Testing Subject");
	   message.setText("Your registration is accepted, You will soon be updated with further procedures.");
	   Transport.send(message);
	   System.out.println("Sent message successfully....");
        } catch (MessagingException | GeneralSecurityException e) {
         throw new RuntimeException(e);
      }
    }
    
    public static void RejectMail(String to){
        try {
        MailSSLSocketFactory sf = new MailSSLSocketFactory();
                sf.setTrustAllHosts(true);
                Properties props = new Properties();
                props.put("mail.imap.ssl.trust", "*");
                props.put("mail.imap.ssl.socketFactory", sf);
                props.put("mail.smtp.auth", true);
                props.put("mail.smtp.starttls.enable",true);
                props.put("mail.smtp.host", host);
                props.put("mail.smtp.port", 587);
        Session session = Session.getInstance(props,
         new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
               return new PasswordAuthentication(username, password);
	   }
         });
	   Message message = new MimeMessage(session);
	   message.setFrom(new InternetAddress(from));
	   message.setRecipients(Message.RecipientType.TO,
           InternetAddress.parse(to));
	   message.setSubject("Testing Subject");
	   message.setText("Your registration is rejected");
	   Transport.send(message);
	   System.out.println("Sent message successfully....");
        } catch (MessagingException | GeneralSecurityException e) {
         throw new RuntimeException(e);
        }
    } 
}
