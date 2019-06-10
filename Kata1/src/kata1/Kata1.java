package kata1;

import java.time.LocalDate;

public class Kata1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1966, 6, 4);
        
        Person person = new Person("Pepe", date);
        System.out.println(person.getName() + " tiene " + person.getAge() 
                           + " años");
    }
}
