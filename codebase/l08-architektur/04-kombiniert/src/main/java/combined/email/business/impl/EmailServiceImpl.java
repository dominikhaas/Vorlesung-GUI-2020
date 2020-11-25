package combined.email.business.impl;

import combined.email.business.api.EmailDto;
import combined.email.business.api.EmailService;

public class EmailServiceImpl implements EmailService {
    @Override
    public void sendEmail(EmailDto emailDto) {
        System.out.println("sendEmail " + emailDto);
    }
}
