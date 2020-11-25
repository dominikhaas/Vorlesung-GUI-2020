package combined.email.business;

import combined.email.business.api.EmailService;
import combined.email.business.impl.EmailServiceImpl;

public class EmailServiceFactory {
    public static EmailService getEmailService() {
        return new EmailServiceImpl();
    }
}
