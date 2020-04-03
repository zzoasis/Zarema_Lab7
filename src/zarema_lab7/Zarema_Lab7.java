package zarema_lab7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class Zarema_Lab7 {

    public static void main(String[] args) {
       Concerts[] tourne = new Concerts[2];

        Concerts RitaOra = new Concerts("Rita Ora","Phoenix", 46500, 2020,03,23);

        Concerts Garou = new Concerts("Garou","Soul city",45400, 2020,02,16);
        Garou.setSingers(RitaOra);

        tourne[0] = RitaOra;
        tourne[1] = Garou;

       try {
            // Сброс данных объекта tour в файл (сериализация данных)
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("concerts.dat"));
            out.writeObject(tourne);
            out.close();

            // Чтение сериализованных данных из файла в объект (десериализация данных)
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("concerts.dat"));
            Concerts[] newTourne = (Concerts[]) in.readObject();
            in.close();

            newTourne[1].raiseTickets(10);

            for (Concerts e : newTourne) {
                System.out.println(e);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
}
}
