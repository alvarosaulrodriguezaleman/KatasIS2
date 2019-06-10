package view;

import java.util.List;
import model.Histogram;
import model.Mail;

public class MailHistogramBuilder {
    public Histogram<String> build(List<Mail> list) {
        Histogram<String> histogram = new Histogram();
        list.forEach((mail) -> {
            histogram.increment(mail.getDomain());
        });
        return histogram;
    } 

    public MailHistogramBuilder() {
    }
}
