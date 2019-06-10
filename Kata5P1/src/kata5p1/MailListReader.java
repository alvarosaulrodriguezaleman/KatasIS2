package kata5p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {
    public List<String> read(String fileName) throws FileNotFoundException, IOException {
        File file = new File(fileName);
        List<String> arr = new ArrayList<String>();
        String aux;
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((aux = br.readLine()) != null) {
                if (aux.contains("@")) {
                    arr.add(aux);
                }
            }
            br.close();
        }
        
        return arr;
    }

    public MailListReader() {
    }
}