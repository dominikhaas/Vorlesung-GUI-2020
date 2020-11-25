package combined.billing.business;

import combined.email.business.api.EmailDto;
import combined.email.business.api.EmailService;
import combined.email.business.EmailServiceFactory;
import combined.email.business.impl.EmailServiceImpl;

public class BillingServiceImpl {
    EmailService emailService = new EmailServiceImpl();

    public void foo() {
        //send email
        emailService.sendEmail(new EmailDto("bla@blub.com", "job done"));
    }
}
