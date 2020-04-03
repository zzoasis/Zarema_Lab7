
package zarema_lab7;


public class Singers extends Concerts {
    private static final long serialVersionUID = 1L;
    private Concerts singers;

    public Singers(String a,String n, double s, int year, int month, int day) {
        super(a, n, s, year, month, day);
        singers = null;
        
    }

    public void setSingers(Concerts s) {
        singers = s;
    }

    public String toString() {
        return super.toString() + "[Singers=" + singers + "]";
    }
}
