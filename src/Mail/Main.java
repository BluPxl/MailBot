package Mail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.*;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        MailUtils.sendMail();
    }
}
