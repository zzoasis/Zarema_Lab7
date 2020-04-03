
package zarema_lab7;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;



public class Concerts implements Serializable {
    
    private static final long serialVersionUID = 1L;
     private String singer;
     private String tour;
    private double tickets;
    private Date when;

    public Concerts(String a,String n,double s, int year, int month, int day) {
        singer = a;
        tour = n;
        tickets = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        when = calendar.getTime();
        
       
    }

    public void raiseTickets(double byPercent) {
        double raise = tickets * byPercent / 100;
        tickets += raise;
    }

    public String toString() {
        return getClass().getName() + "[singer=" + singer+ ",tour=" + tour  + ",tickets=" + tickets + ",when=" + when + "]";
        
    }

    void setSingers(Concerts RitaOra) {
       
    }

}
