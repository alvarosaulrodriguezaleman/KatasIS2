package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

public class Kata4 {

    Histogram histogram;
    List<Mail> arr;
    
    public static void main(String[] args) {
        Kata4 kata4 = new Kata4();
        kata4.control();
    }
    
    private void control() {
        input();
        process();
        output();
    }

    private void input() {
        arr = new ArrayList<Mail>();
        try {
            arr = new MailListReader().read("email.txt");
        } catch (IOException ex) {
            System.out.println("No se pudo leer el fichero: " + ex);
        }
    }

    private void process() {
        histogram = new MailHistogramBuilder().build(arr);
    }
    
    private void output() {
        new HistogramDisplay(histogram).execute();
    }
}