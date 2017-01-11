package ziuk;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

/**
 * Created by RENT on 2017-01-10.
 */
public class wysyłanie {

    Email email = new SimpleEmail();
email.setHostName("smtp.googlemail.com");
email.setSmtpPort(465);
email.setAuthenticator(new DefaultAuthenticator("javandwro1@gmail.com", "javandwro1"));
email.setSSLOnConnect(true);
email.setFrom("javandwro1@gmail.com");
email.setSubject("ola.txt");
email.setMsg("królik");
email.addTo("javaandwro1@gmail.com");
email.send();

    MultiPartEmail email = new MultiPartEmail();
  email.setHostName("mail.myserver.com");
  email.addTo("jdoe@somewhere.org", "John Doe");
  email.setFrom("me@apache.org", "Me");
  email.setSubject("The picture");
  email.setMsg("Here is the picture you wanted");

}
