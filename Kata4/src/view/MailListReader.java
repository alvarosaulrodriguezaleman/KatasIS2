package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Mail;

public class MailListReader {
    public List<Mail> read(String fileName) throws FileNotFoundException, IOException {
        File file = new File(fileName);
        List<Mail> arr = new ArrayList<Mail>();
        String aux;
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((aux = br.readLine()) != null) {
                if (aux.contains("@")) {
                    arr.add(new Mail(aux));
                }
            }
            br.close();
        }
        
        return arr;
    }

    public MailListReader() {
    }
}
