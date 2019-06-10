package main;

import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReaderBD;

public class Kata5P2 {
    Histogram histogram;
    List<Mail> arr;
    
    public static void main(String[] args) {
        Kata5P2 kata5p2 = new Kata5P2();
        kata5p2.control();
    }
    
    private void control() {
        input();
        process();
        output();
    }

    private void input() {
        arr = new MailListReaderBD().read();
    }

    private void process() {
        histogram = new MailHistogramBuilder().build(arr);
    }
    
    private void output() {
        new HistogramDisplay(histogram).execute();
    }
}